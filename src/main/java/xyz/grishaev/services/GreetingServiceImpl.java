package xyz.grishaev.services;

import org.springframework.stereotype.Component;

/**
 * Created by USER on 19.11.2015.
 */
@Component
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
