package com.jalasoft.articles.adapters.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Giordano Bortolini
 */

public class ArticleDTO
{
    @JsonProperty("title")
    private final String title;
    @JsonProperty("content")
    private final String content;
    @JsonProperty("authorId")
    private final String authorId;

    ArticleDTO(final String title, final String content, final String authorId)
    {
        this.title = title;
        this.content = content;
        this.authorId = authorId;
    }
}
