package com.javamind;

import com.javamind.dto.ArticleBlog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Test du scan
 *
 * @author Guillaume EHRET
 */
@Configuration
@ComponentScan("com.javamind.autoscan")
public class JavaConfigAutoScan {

}
