package com.javamind;

import com.javamind.dto.ArticleBlog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

/**
 * Chargement fichier properties
 *
 * @author Guillaume EHRET
 */
@Configuration
@PropertySource(value="classpath:application.properties")
public class JavaConfigProperty {
    @Resource
    private Environment env;

    @Bean
    public ArticleBlog articleBlog(){
        return new ArticleBlog()
                .setTitle(env.getRequiredProperty("article.name"))
                .setVersion(env.getProperty("article.version", "1.0"));
    }
}
