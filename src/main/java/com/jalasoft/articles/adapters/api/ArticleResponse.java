package com.jalasoft.articles.adapters.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jalasoft.articles.domain.model.Article;

/**
 * @author Giordano Bortolini
 */

public class ArticleResponse
{
    private final String id;
    private final String title;
    private final String content;
    private final String authorName;

    private ArticleResponse(
        final String id,
        final String title,
        final String content,
        final String authorName)
    {
        this.id = id;
        this.title = title;
        this.content = content;
        this.authorName = authorName;
    }

    static ArticleResponse of(final Article article)
    {
        return new ArticleResponse(
            article.getId(),
            article.getTitle(),
            article.getContent(),
            article.getAuthor().getName());
    }

    @JsonProperty("id")
    String id()
    {
        return id;
    }

    @JsonProperty("title")
    String title()
    {
        return title;
    }

    @JsonProperty("content")
    String content()
    {
        return content;
    }

    @JsonProperty("authorName")
    String authorName()
    {
        return authorName;
    }
}
