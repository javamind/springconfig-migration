package com.javamind;

import com.javamind.dto.ArticleBlog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test utilisation fichier properties
 *
 * @author Guillaume EHRET
 */
public class ArticleServicePropertyTest {

    @Test
    public void shouldFindBeanWithJavaConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigProperty.class);
        ArticleBlog articleBlog = ctx.getBean(ArticleBlog.class);
        assertThat(articleBlog.getTitle()).isEqualTo("test");
        assertThat(articleBlog.getVersion()).isEqualTo("2.0");
    }
}
