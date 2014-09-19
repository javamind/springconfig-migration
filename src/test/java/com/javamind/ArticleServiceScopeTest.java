package com.javamind;

import com.javamind.dto.ArticleBlog;
import com.javamind.dto.Blog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test scope prototype
 *
 * @author Guillaume EHRET
 */
public class ArticleServiceScopeTest {

    @Test
    public void shouldFindBeanWithXmlConfig(){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-scope.xml");
        //comme le Bean n'instancie pas Comparable on compare les references
        assertThat(ctx.getBean(ArticleBlog.class)).isNotEqualTo(ctx.getBean(ArticleBlog.class));
        assertThat(ctx.getBean(Blog.class)).isEqualTo(ctx.getBean(Blog.class));
    }

    @Test
    public void shouldFindBeanWithJavaConfig(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigScope.class);
        //comme le Bean n'instancie pas Comparable on compare les references
        assertThat(ctx.getBean(ArticleBlog.class)).isNotEqualTo(ctx.getBean(ArticleBlog.class));
        assertThat(ctx.getBean(Blog.class)).isEqualTo(ctx.getBean(Blog.class));
    }
}
