package com.myexample;

import org.springframework.web.bind.annotation.*;
import com.myexample.Person;

@RestController
public class HelloController {
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public Person hello(@RequestParam(value = "name", defaultValue = "world") String name,
                        @RequestParam(value = "surname", defaultValue = "blue") String surname) {
        return new Person(name, surname, 20);
    }

    @RequestMapping(value = "/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "world") String name){
        return "Hello " + name;
    }
    
}
