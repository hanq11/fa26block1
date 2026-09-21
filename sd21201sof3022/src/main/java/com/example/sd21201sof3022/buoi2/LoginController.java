package com.example.sd21201sof3022.buoi2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi2")
public class LoginController {
    @GetMapping("/show-form") // => /buoi2/show-form
//    @RequestMapping(value = "/show-form", method = RequestMethod.GET)
    public String showForm() {
        return "buoi2/hien-thi";
    }

//    @PostMapping("/login")
//    public String login(
//            @RequestParam("username") String username,
//            @RequestParam("password") String password,
//            @RequestParam(value = "remember", defaultValue = "false") Boolean remember,
//            Model model
//    ) {
//        model.addAttribute("usr", username);
//        model.addAttribute("pwd", password);
//        model.addAttribute("rm", remember);
//        return "buoi2/thong-tin";
//    }

    @ModelAttribute("helloMessage")
    public String helloMessage() {
        return "hello world";
    }

    @PostMapping("/login")
    public String login(Login login, Model model) {
        model.addAttribute("usr", login.getUsername());
        model.addAttribute("pwd", login.getPassword());
        model.addAttribute("rm", login.getRemember());
        return "buoi2/thong-tin";
    }
}
