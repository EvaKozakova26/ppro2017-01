package cz.uhk.ppro;

import cz.uhk.ppro.service.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.swing.*;

@SpringBootApplication
@Configuration
@PropertySource("classpath:/config.properties")
public class Application {

    @Value("${template:Please add template}")
    String template;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public GreetingService greetingService() {
        return  new GreetingService(template);
    }
}