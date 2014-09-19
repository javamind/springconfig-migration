package com.javamind;

import com.javamind.dto.ArticleBlog;
import com.javamind.dto.FavoriteArticle;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import javax.annotation.Resource;

/**
 * Injection de dependance définie dans un autre bean de configuration
 *
 * @author Guillaume EHRET
 */
@Configuration
@Import(JavaConfigScope.class)
public class JavaConfigDependanceExterne {

    @Bean
    public FavoriteArticle favoriteArticle(ArticleBlog article1, ArticleBlog article2){
        FavoriteArticle article = new FavoriteArticle(article1);
        article.setArticleBlogSecond(article2);
        return article;
    }
}
