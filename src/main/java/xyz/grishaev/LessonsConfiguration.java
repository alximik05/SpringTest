package xyz.grishaev;

import org.springframework.context.annotation.*;
import xyz.grishaev.services.CommandManager;
import xyz.grishaev.services.GreetingService;
import xyz.grishaev.services.GreetingServiceImpl;

import java.util.Objects;

/**
 * Created by USER on 19.11.2015.
 */
@ComponentScan(basePackages = "xyz.grishaev.services")
@Configuration
@Import(AnotherConfiguration.class)
public class LessonsConfiguration {

    @Bean
    @Scope("prototype")
    public Object asyncCommand() {
        return new Object();
    }

    @Bean
    CommandManager commandManager() {
        return new CommandManager() {
            @Override
            protected Object createCommand() {
                return asyncCommand();
            }
        };
    }
}
