package com.example.hellospringboot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {





    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "thisName") String name) {
        return String.format("Hello %s!", name) +
                "\nReversed order: " + reversed(name);
    }

    public String reversed(String name) {
        if (name == null) {
            return name;
        }
        String result = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            result = result + name.charAt(i);
        }
        return result;
    }

}

