package com.jalasoft.articles.domain.model;

import lombok.Getter;

/**
 * @author Giordano Bortolini
 */

@Getter
public class Article
{

    private final String id;
    private final String title;
    private final String content;
    private final Author author;

    private Article(
        final String id, final String title, final String content,
        final Author author)
    {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void validateEligibilityForPublication()
    {
        verifyForPlagiarism();
        validateTitleLength();
        validateContentLength();
        checkPunctuation();
        checkGrammar();
        checkStyle();
    }

    private void checkGrammar()
    {
    }

    private void checkStyle()
    {
    }

    private void checkPunctuation()
    {
    }

    private void verifyForPlagiarism()
    {
    }

    private void validateContentLength()
    {
    }

    private void validateTitleLength()
    {
    }

    public static ArticleBuilder article()
    {
        return new ArticleBuilder();
    }

    public static final class ArticleBuilder
    {
        private String id;
        private String title;
        private String content;
        private Author author;

        private ArticleBuilder()
        {
        }

        public ArticleBuilder withId(String id)
        {
            this.id = id;
            return this;
        }

        public ArticleBuilder withTitle(String title)
        {
            this.title = title;
            return this;
        }

        public ArticleBuilder withContent(String content)
        {
            this.content = content;
            return this;
        }

        public ArticleBuilder withAuthor(Author author)
        {
            this.author = author;
            return this;
        }

        public Article build()
        {
            return new Article(id, title, content, author);
        }
    }
}
