package com.example.sd21201sof3022.buoi1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("/buoi1/hello-world")
    public String helloWorld() {
        return "/buoi1/helloWorld";
    }
}
