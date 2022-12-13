package com.jalasoft.articles.domain;

import com.jalasoft.articles.domain.model.Article;
import com.jalasoft.articles.domain.ports.ArticleMessageSender;
import com.jalasoft.articles.domain.ports.AuthorNotifier;
import com.jalasoft.articles.domain.ports.SocialMediaPublisher;
import java.util.List;

/**
 * @author Giordano Bortolini
 */

public class ArticlePublisher
{
    private final ArticleMessageSender messageSender;
    private final List<SocialMediaPublisher> socialMediaPublishers;
    private final List<AuthorNotifier> articleAuthorNotifiers;

    public ArticlePublisher(
        final ArticleMessageSender messageSender,
        final List<SocialMediaPublisher> socialMediaPublishers,
        final List<AuthorNotifier> articleAuthorNotifiers)
    {
        this.messageSender = messageSender;
        this.socialMediaPublishers = socialMediaPublishers;
        this.articleAuthorNotifiers = articleAuthorNotifiers;
    }

    public void publishCreationOf(final Article article)
    {
        messageSender.sendMessageForCreated(article);
        socialMediaPublishers.forEach(socialMediaPublisher -> socialMediaPublisher.publish(article));
        articleAuthorNotifiers.forEach(articleAuthorNotifier -> articleAuthorNotifier.notifyAboutCreationOf(
            article));
    }

    public void publishRetrievalOf(final Article article)
    {
        messageSender.sendMessageForRetrieved(article);
    }
}
