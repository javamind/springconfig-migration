package com.javamind;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Import d'autres beans de configuration
 *
 * @author Guillaume EHRET
 */
@Configuration
@Import({JavaConfigSimple.class, JavaConfigAutoScan.class})
public class JavaConfigImport {

}
