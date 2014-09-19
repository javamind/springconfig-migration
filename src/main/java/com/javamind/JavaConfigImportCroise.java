package com.javamind;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Import d'une conf XML en Java
 *
 * @author Guillaume EHRET
 */
@Configuration
@Import({JavaConfigSimple.class})
@ImportResource(value = "classpath:spring-scan.xml")
public class JavaConfigImportCroise {

}
