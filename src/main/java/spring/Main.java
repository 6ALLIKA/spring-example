package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;
import spring.model.User;
import spring.service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(new User("dima", "email", "pass"));
        userService.add(new User("bodya", "email1", "pass"));
        userService.add(new User("sanya", "email2", "pass"));
        userService.add(new User("serega", "email3", "pass"));

        userService.getAll().forEach(System.out::println);
    }
}
