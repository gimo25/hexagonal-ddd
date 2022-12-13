package com.jalasoft.articles.adapters.api;

import com.jalasoft.articles.domain.ports.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Giordano Bortolini
 */
@RestController
@RequestMapping("articles")
class ArticleController
{

    private final ArticleService articles;

    public ArticleController(ArticleService articles)
    {
        this.articles = articles;
    }

    @GetMapping("{articleId}")
    public ArticleDTO get(@PathVariable("articleId") final String articleId)
    {
        return articles.get(articleId);
    }

    @PostMapping
    public String create(@RequestBody final ArticleDTO articleRequest)
    {
        return articles.create(articleRequest);
    }
}
