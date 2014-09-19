package com.javamind;

import com.javamind.dto.ArticleBlog;
import com.javamind.dto.Blog;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Utilisation du scope prototype
 *
 * @author Guillaume EHRET
 */
@Configuration
public class JavaConfigScope {
    @Bean
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public ArticleBlog articleBlog(){
        return new ArticleBlog();
    }

    @Bean
    public Blog blog(){
        return new Blog();
    }
}
