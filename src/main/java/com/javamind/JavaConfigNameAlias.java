package com.javamind;

import com.javamind.dto.ArticleBlog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Injection par nom
 *
 * @author Guillaume EHRET
 */
@Configuration
public class JavaConfigNameAlias {
    @Bean(name={"articleBlog", "monalias"})
    public ArticleBlog articleBlog(){
        return new ArticleBlog();
    }
}
