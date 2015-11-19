package xyz.grishaev.services;

/**
 * Created by USER on 19.11.2015.
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
