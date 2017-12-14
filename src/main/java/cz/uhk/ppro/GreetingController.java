package cz.uhk.ppro;

import cz.uhk.ppro.model.Greeting;
import cz.uhk.ppro.model.Student;
import cz.uhk.ppro.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService = new GreetingService();


    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="worldA5") String name) {

        return greetingService.createGreetings(name);
    }

    @PostMapping("/save")
    public void saveStudent(@RequestBody Student s) {
        System.out.println("Studen" + s.getName());
    }
}
