package com.javamind.dto;

/**
 * un article tout simple
 *
 * @author Guillaume EHRET
 */
public class ArticleBlog {

    private String title;
    private String version;

    public String getTitle() {
        return title;
    }

    public ArticleBlog setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public ArticleBlog setVersion(String version) {
        this.version = version;
        return this;
    }
}
