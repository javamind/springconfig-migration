package com.javamind;

import com.javamind.dto.ArticleBlog;
import com.javamind.dto.FavoriteArticle;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Injection de dependance
 *
 * @author Guillaume EHRET
 */
@Configuration
public class JavaConfigDependance {
    @Bean
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public ArticleBlog articleBlog(){
        return new ArticleBlog();
    }

    @Bean
    public FavoriteArticle favoriteArticle(){
        FavoriteArticle article = new FavoriteArticle(articleBlog());
        article.setArticleBlogSecond(articleBlog());
        return article;
    }
}
