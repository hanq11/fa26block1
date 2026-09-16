package com.example.sd21201sof3022.buoi2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/buoi2")
public class LoginController {
    @GetMapping("/show-form")
    public String showForm() {
        return "buoi2/hien-thi";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("remember") Boolean remember,
            Model model
    ) {
        model.addAttribute("usr", username);
        model.addAttribute("pwd", password);
        model.addAttribute("rm", remember);
        return "buoi2/thong-tin";
    }
}
