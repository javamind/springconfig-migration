package com.javamind;

import com.javamind.autoscan.ServiceExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test de l'auto scan
 *
 * @author Guillaume EHRET
 */
public class ArticleServiceAutoScanTest {

    @Test
    public void shouldFindBeanWithXmlConfig(){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-scan.xml");
       assertThat(ctx.getBean(ServiceExample.class)).isNotNull();
    }

    @Test
    public void shouldFindBeanWitgJavaConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigAutoScan.class);
        assertThat(ctx.getBean(JavaConfigAutoScan.class)).isNotNull();
    }
}
