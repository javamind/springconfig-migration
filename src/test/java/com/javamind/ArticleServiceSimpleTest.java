package com.javamind;

import com.javamind.dto.ArticleBlog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test injection simple
 *
 * @author Guillaume EHRET
 */
public class ArticleServiceSimpleTest {

    @Test
    public void shouldFindBeanWithXmlConfig(){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring.xml");
       assertThat(ctx.getBean(ArticleBlog.class)).isNotNull();
    }

    @Test
    public void shouldFindBeanWithJavaConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigSimple.class);
        assertThat(ctx.getBean(ArticleBlog.class)).isNotNull();
    }
}
