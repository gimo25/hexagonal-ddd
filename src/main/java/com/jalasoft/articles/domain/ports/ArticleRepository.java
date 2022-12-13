package com.jalasoft.articles.domain.ports;

import com.jalasoft.articles.domain.model.Article;
import com.jalasoft.articles.domain.model.Author;

/**
 * @author Giordano Bortolini
 */

public interface ArticleRepository
{

    Article save(Author author, String title, String content);

    Article get(String id);
}
