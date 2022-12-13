package com.jalasoft.articles.domain.model;

import lombok.Getter;

/**
 * @author Giordano Bortolini
 */

@Getter
public class Author
{
    private final String id;
    private final String name;

    private Author(final String id, final String name)
    {
        this.id = id;
        this.name = name;
    }

    public static AuthorBuilder author()
    {
        return new AuthorBuilder();
    }

    public static final class AuthorBuilder
    {
        private String id;
        private String name;

        private AuthorBuilder()
        {
        }

        public AuthorBuilder withId(String id)
        {
            this.id = id;
            return this;
        }

        public AuthorBuilder withName(String name)
        {
            this.name = name;
            return this;
        }

        public Author build()
        {
            return new Author(id, name);
        }
    }
}
