package com.javamind;

import com.javamind.dto.ArticleBlog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Injection simple
 *
 * @author Guillaume EHRET
 */
@Configuration
public class JavaConfigSimple {
    @Bean
    public ArticleBlog articleBlog(){
        return new ArticleBlog();
    }
}
