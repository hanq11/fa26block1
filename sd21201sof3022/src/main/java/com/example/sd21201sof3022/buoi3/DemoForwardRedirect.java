package com.example.sd21201sof3022.buoi3;

import com.example.sd21201sof3022.buoi2.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/buoi3")
public class DemoForwardRedirect {
    // forward
    @GetMapping("/u1")
    public String u1() {
        return "forward:/buoi3/u2";
    }

    @GetMapping("/u2")
    public String u2() {
        return "forward:/buoi3/u3";
    }

    @GetMapping("/u3")
    public String u3() {
        return "/buoi2/hien-thi";
    }
    // redirect
    @GetMapping("/u4")
    public String u4() {
        return "redirect:/buoi3/u3";
    }

    @GetMapping("/demo-api")
    @ResponseBody
    public List<Login> demoApi() {
        List<Login> list = new ArrayList<>();
        list.add(new Login("123", "234", true));
        list.add(new Login("234", "234", false));
        list.add(new Login("345", "323", false));
        list.add(new Login("893", "234", true));
        return list;
    }
}
