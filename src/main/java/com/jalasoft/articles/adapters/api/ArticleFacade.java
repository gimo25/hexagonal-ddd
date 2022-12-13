package com.jalasoft.articles.adapters.api;

import com.jalasoft.articles.domain.model.Article;
import com.jalasoft.articles.domain.ports.ArticleService;
import org.springframework.stereotype.Component;

/**
 * @author Giordano Bortolini
 */

@Component
public class ArticleFacade
{

    private final ArticleService articleService;

    public ArticleFacade(final ArticleService articleService)
    {
        this.articleService = articleService;
    }

    public ArticleResponse get(final String articleId)
    {
        final Article article = articleService.get(articleId);
        return ArticleResponse.of(article);
    }

    public String create(final ArticleDTO articleRequest)
    {
        final String articleId = articleService.create();
        return articleId;
    }
}
