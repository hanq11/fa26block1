package com.example.sd21201sof3022.buoi11.controller;

import com.example.sd21201sof3022.buoi11.entity.DanhMuc;
import com.example.sd21201sof3022.buoi11.entity.SanPham;
import com.example.sd21201sof3022.buoi11.repository.DanhMucRepository;
import com.example.sd21201sof3022.buoi11.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/san-pham")
public class SanPhamController {
    @Autowired
    SanPhamRepository sanPhamRepository;

    @Autowired
    DanhMucRepository danhMucRepository;

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSanPham", sanPhamRepository.findAll());
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/sanPham/hien-thi";
    }

    @PostMapping("/them")
    public String themSanPham(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
        return "redirect:/san-pham/hien-thi";
    }

//    @ModelAttribute("listDanhMuc")
//    public List<DanhMuc> getListDanhMuc() {
//        return danhMucRepository.findAll();
//    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("sanPham", sanPhamRepository.findById(id).get());
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/sanPham/view-update";
    }

    @PostMapping("/sua")
    public String suaSanPham(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
        return "redirect:/san-pham/hien-thi";
    }

    @GetMapping("/xoa")
    public String xoaSanPham(@RequestParam("id") Integer id) {
        sanPhamRepository.deleteById(id);
        return "redirect:/san-pham/hien-thi";
    }
}
