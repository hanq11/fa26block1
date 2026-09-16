package com.example.sd21201sof3022.buoi1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // annotation
public class HelloWorldController {
    @GetMapping("/buoi1/hello-world")
    public String helloWorld(Model model) {
        model.addAttribute("ten", "SD21201");
        return "/buoi1/helloWorld";
    }
}
