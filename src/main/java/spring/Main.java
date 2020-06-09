package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
