package xyz.grishaev.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.grishaev.LessonsConfiguration;
import xyz.grishaev.services.GreetingService;

/**
 * Created by USER on 19.11.2015.
 */
public class Starter {
    public static final Logger LOG = LoggerFactory.getLogger(Starter.class);

    public static void main(String[] args) {
        LOG.debug("Starter");
        ApplicationContext context = new AnnotationConfigApplicationContext(LessonsConfiguration.class);
        GreetingService service = context.getBean(GreetingService.class);
        LOG.debug(service.sayGreeting());
    }
}
