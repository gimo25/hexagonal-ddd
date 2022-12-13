package com.jalasoft.articles.domain.ports;

import com.jalasoft.articles.domain.model.Article;

/**
 * @author Giordano Bortolini
 */

public interface SocialMediaPublisher
{

    void publish(Article article);
}
