package com.jalasoft.articles.domain.ports;

import com.jalasoft.articles.domain.model.Article;

/**
 * @author Giordano Bortolini
 */

public interface ArticleMessageSender
{

    void sendMessageForCreated(Article article);

    void sendMessageForRetrieved(Article article);
}
