package com.example.sd21201sof3022.buoi11.controller;

import com.example.sd21201sof3022.buoi11.entity.DanhMuc;
import com.example.sd21201sof3022.buoi11.repository.DanhMucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi11")
public class DanhMucController {
    @Autowired
    DanhMucRepository danhMucRepository;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/buoi11/hien-thi";
    }

    @PostMapping("/them")
    public String themDanhMuc(DanhMuc danhMuc) {
        danhMucRepository.save(danhMuc);
        return "redirect:/buoi11/hien-thi";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("danhMuc", danhMucRepository.findById(id).get());
        return "/buoi11/view-update";
    }
    @PostMapping("/sua")
    public String suaDanhMuc(DanhMuc danhMuc) {
        danhMucRepository.save(danhMuc);
        return "redirect:/buoi11/hien-thi";
    }

    @GetMapping("/xoa")
    public String xoaDanhMuc(@RequestParam("id") Integer id) {
        danhMucRepository.deleteById(id);
        return "redirect:/buoi11/hien-thi";
    }
}
