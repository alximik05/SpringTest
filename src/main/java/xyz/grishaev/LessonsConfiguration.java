package xyz.grishaev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import xyz.grishaev.services.GreetingService;
import xyz.grishaev.services.GreetingServiceImpl;

/**
 * Created by USER on 19.11.2015.
 */
@ComponentScan
@Configuration
public class LessonsConfiguration {
    @Bean
    @Description("Текстовое описание бина greetingService")
    GreetingService greetingService(){
        return new GreetingServiceImpl();
    }
}
