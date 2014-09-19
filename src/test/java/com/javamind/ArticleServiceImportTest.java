package com.javamind;

import com.javamind.autoscan.ServiceExample;
import com.javamind.dto.ArticleBlog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test import de configuration d�port�e dans un autre fichier ou une autre classe
 *
 * @author Guillaume EHRET
 */
public class ArticleServiceImportTest {

    @Test
    public void shouldFindBeanWithXmlConfig(){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-import.xml");
       assertThat(ctx.getBean(ArticleBlog.class)).isNotNull();
        assertThat(ctx.getBean(ServiceExample.class)).isNotNull();
    }

    @Test
    public void shouldFindBeanWithJavaConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigImport.class);
        assertThat(ctx.getBean(ArticleBlog.class)).isNotNull();
        assertThat(ctx.getBean(ServiceExample.class)).isNotNull();
    }
}
