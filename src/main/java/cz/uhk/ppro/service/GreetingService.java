package cz.uhk.ppro.service;

import cz.uhk.ppro.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
    private final String template;
    private final AtomicLong counter = new AtomicLong();

    public GreetingService() {
        this.template = "Hello, %s!";
    }

    public GreetingService(String template) {
        this.template = template;
    }

    public Greeting createGreetings(String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
