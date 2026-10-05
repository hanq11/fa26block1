package com.example.sd21201sof3022.buoi10.controller;

import com.example.sd21201sof3022.buoi10.entity.CongTy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/bean1")
public class BeanDemoController {
    @Autowired
    CongTy congTy;

    @GetMapping("/get")
    @ResponseBody
    public CongTy getCongTy() {
        return congTy;
    }

    @GetMapping("/edit")
    @ResponseBody
    public CongTy editCongTy() {
        congTy.setTen("FPT");
        return congTy;
    }
}

