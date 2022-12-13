package com.jalasoft.articles.adapters.socialmedia;

import com.jalasoft.articles.domain.model.Article;
import com.jalasoft.articles.domain.ports.SocialMediaPublisher;
import org.springframework.stereotype.Component;

/**
 * @author Giordano Bortolini
 */

@Component
class TwitterArticlePublisher implements SocialMediaPublisher
{

    private final TwitterClient twitterClient;

    TwitterArticlePublisher(final TwitterClient twitterClient)
    {
        this.twitterClient = twitterClient;
    }

    @Override
    public void publish(final Article article)
    {
        final ArticleTwitterModel articleTweet = ArticleTwitterModel.of(article);
        twitterClient.tweet(articleTweet);
    }
}
