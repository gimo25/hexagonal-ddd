package com.jalasoft.articles.domain.ports;

import com.jalasoft.articles.domain.model.Author;

/**
 * @author Giordano Bortolini
 */

public interface AuthorRepository
{

    Author get(String authorId);
}
