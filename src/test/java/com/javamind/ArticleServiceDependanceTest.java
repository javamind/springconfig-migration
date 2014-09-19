package com.javamind;

import com.javamind.dto.ArticleBlog;
import com.javamind.dto.FavoriteArticle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test injection des dépendances
 *
 * @author Guillaume EHRET
 */
public class ArticleServiceDependanceTest {

    @Test
    public void shouldFindBeanWithXmlConfig() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-dependance.xml");
        FavoriteArticle favoriteArticle = ctx.getBean(FavoriteArticle.class);
        assertThat(favoriteArticle).isNotNull();
        assertThat(favoriteArticle.getArticleBlog()).isNotNull();
        assertThat(favoriteArticle.getArticleBlogSecond()).isNotNull();
        assertThat(favoriteArticle.getArticleBlog()).isNotEqualTo(favoriteArticle.getArticleBlogSecond());
    }

    @Test
    public void shouldFindBeanWithJavaConfig() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigDependance.class);
        FavoriteArticle favoriteArticle = ctx.getBean(FavoriteArticle.class);
        assertThat(favoriteArticle).isNotNull();
        assertThat(favoriteArticle.getArticleBlog()).isNotNull();
        assertThat(favoriteArticle.getArticleBlogSecond()).isNotNull();
        assertThat(favoriteArticle.getArticleBlog()).isNotEqualTo(favoriteArticle.getArticleBlogSecond());
    }

    @Test
    public void shouldFindBeanWithJavaConfig2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigDependanceExterne.class);
        FavoriteArticle favoriteArticle = ctx.getBean(FavoriteArticle.class);
        assertThat(favoriteArticle).isNotNull();
        assertThat(favoriteArticle.getArticleBlog()).isNotNull();
        assertThat(favoriteArticle.getArticleBlogSecond()).isNotNull();
        assertThat(favoriteArticle.getArticleBlog()).isNotEqualTo(favoriteArticle.getArticleBlogSecond());
    }
}
