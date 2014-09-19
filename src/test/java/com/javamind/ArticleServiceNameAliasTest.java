package com.javamind;

import com.javamind.dto.ArticleBlog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test injection par nom ou alias
 *
 * @author Guillaume EHRET
 */
public class ArticleServiceNameAliasTest {

    @Test
    public void shouldFindBeanWithXmlConfig(){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-alias.xml");
       assertThat(ctx.getBean("articleBlog")).isNotNull();
       assertThat(ctx.getBean("monalias")).isNotNull();
    }

    @Test
    public void shouldFindBeanWithJavaConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigNameAlias.class);
        assertThat(ctx.getBean("articleBlog")).isNotNull();
        assertThat(ctx.getBean("monalias")).isNotNull();
    }
}
