package spring.config;

import java.util.Properties;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import spring.model.User;

@Configuration
@ComponentScan(basePackages = {
        "spring.dao",
        "spring.service"
        }
)
public class AppConfig {

    @Bean
    public BasicDataSource getDataSourse() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate?serverTimezone=UTC");
        dataSource.setPassword("12341234");
        dataSource.setUsername("root");
        return dataSource;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setDataSource(getDataSourse());

        Properties properties = new Properties();
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.format_sql", "true");
        properties.put("hibernate.use_sql_comments", "true");
        properties.put("hibernate.hbm2ddl.auto", "create-drop");

        factoryBean.setHibernateProperties(properties);
        factoryBean.setAnnotatedClasses(User.class);

        return factoryBean;
    }

}