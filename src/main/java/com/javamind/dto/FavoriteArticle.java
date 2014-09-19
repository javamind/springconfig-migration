package com.javamind.dto;

/**
 * un article favori est lie à un article
 *
 * @author Guillaume EHRET
 */
public class FavoriteArticle {
    private ArticleBlog articleBlog;
    private ArticleBlog articleBlogSecond;

    public FavoriteArticle(ArticleBlog articleBlog) {
        this.articleBlog = articleBlog;
    }

    public ArticleBlog getArticleBlog() {
        return articleBlog;
    }

    public ArticleBlog getArticleBlogSecond() {
        return articleBlogSecond;
    }

    public void setArticleBlogSecond(ArticleBlog articleBlogSecond) {
        this.articleBlogSecond = articleBlogSecond;
    }
}
