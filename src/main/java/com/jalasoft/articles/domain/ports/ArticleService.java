package com.jalasoft.articles.domain.ports;

import com.jalasoft.articles.domain.ArticlePublisher;
import com.jalasoft.articles.domain.model.Article;
import com.jalasoft.articles.domain.model.Author;

/**
 * @author Giordano Bortolini
 */

public final class ArticleService
{

    private final ArticleRepository articleRepository;
    private final AuthorRepository authorRepository;
    private final ArticlePublisher eventPublisher;

    public ArticleService(
        final ArticleRepository articleRepository,
        final AuthorRepository authorRepository,
        final ArticlePublisher eventPublisher)
    {
        this.articleRepository = articleRepository;
        this.authorRepository = authorRepository;
        this.eventPublisher = eventPublisher;
    }

    public String create(final String authorId, final String title, final String content)
    {
        final Author author = authorRepository.get(authorId);
        final Article article = articleRepository.save(author, title, content);

        article.validateEligibilityForPublication();

        eventPublisher.publishCreationOf(article);
        return article.getId();
    }

    public Article get(final String id)
    {
        final Article article = articleRepository.get(id);
        eventPublisher.publishRetrievalOf(article);
        return article;
    }
}
