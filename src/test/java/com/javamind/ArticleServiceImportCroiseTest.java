package com.javamind;

import com.javamind.autoscan.ServiceExample;
import com.javamind.dto.ArticleBlog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test chargement conf XML dans conf Java et inverse
 *
 * @author Guillaume EHRET
 */
public class ArticleServiceImportCroiseTest {

    @Test
    public void shouldFindBeanWithXmlConfig(){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-import-croise.xml");
       assertThat(ctx.getBean(ArticleBlog.class)).isNotNull();
        assertThat(ctx.getBean(ServiceExample.class)).isNotNull();
    }

    @Test
    public void shouldFindBeanWithJavaConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigImportCroise.class);
        assertThat(ctx.getBean(ArticleBlog.class)).isNotNull();
        assertThat(ctx.getBean(ServiceExample.class)).isNotNull();
    }
}
