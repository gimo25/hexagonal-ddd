package com.jalasoft.articles.adapters.socialmedia;

import com.jalasoft.articles.domain.model.Article;

/**
 * @author Giordano Bortolini
 */

public class ArticleTwitterModel
{

    public static final String TWEET = "Check out the new article >>%s<< by %s";
    private final String twitterAccountId;
    private final String tweet;

    private ArticleTwitterModel(final String twitterAccountId, final String tweet)
    {
        this.twitterAccountId = twitterAccountId;
        this.tweet = tweet;
    }

    static ArticleTwitterModel of(Article article)
    {
        final String title = article
            .getTitle();
        final String twitterId = article.getAuthor().getName();
        return new ArticleTwitterModel(twitterId, String.format(TWEET, title, twitterId));
    }

    @Override
    public String toString()
    {
        return tweet;
    }
}
