package com.javamind;

import com.javamind.dto.ArticleBlog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test des profils Spring
 *
 * @author Guillaume EHRET
 */
public class ArticleServiceProfileTest {

    @Test
    public void shouldFindBeanWithXmlConfigAndProfileDev() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-profile.xml");
        ctx.getEnvironment().addActiveProfile("dev");
        ctx.refresh();
        assertThat(ctx.getBean(ArticleBlog.class).getTitle()).isEqualTo("Mon article de dev");
    }

    @Test
    public void shouldFindBeanWithJavaConfigAndProfileDev() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(JavaConfigProfile.class);
        ctx.getEnvironment().addActiveProfile("dev");
        ctx.refresh();
        assertThat(ctx.getBean(ArticleBlog.class).getTitle()).isEqualTo("Mon article de dev");
    }

    @Test
    public void shouldFindBeanWithXmlConfigAndProfileProd() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-profile.xml");
        ctx.getEnvironment().addActiveProfile("prod");
        ctx.refresh();
        assertThat(ctx.getBean(ArticleBlog.class).getTitle()).isEqualTo("Mon article de prod");
    }

    @Test
    public void shouldFindBeanWithJavaConfigAndProfileProd() {
//        System.setProperty("spring.profiles.active", "prod");
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigProfile.class);
//        assertThat(ctx.getBean(ArticleBlog.class).getTitle()).isEqualTo("Mon article de prod");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(JavaConfigProfile.class);
        ctx.getEnvironment().addActiveProfile("prod");
        ctx.refresh();

        assertThat(ctx.getBean(ArticleBlog.class).getTitle()).isEqualTo("Mon article de prod");
    }
}
