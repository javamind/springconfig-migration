package com.javamind;

import com.javamind.dto.ArticleBlog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Utilisation des profils
 *
 * @author Guillaume EHRET
 */
@Configuration
public class JavaConfigProfile {
    @Bean
    @Profile("dev")
    public ArticleBlog articleBlogDev(){
        return new ArticleBlog().setTitle("Mon article de dev");
    }

    @Bean
    @Profile("prod")
    public ArticleBlog articleBlogProd(){
        return new ArticleBlog().setTitle("Mon article de prod");
    }
}
