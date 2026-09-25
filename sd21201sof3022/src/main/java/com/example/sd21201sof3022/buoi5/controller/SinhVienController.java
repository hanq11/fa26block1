package com.example.sd21201sof3022.buoi5.controller;

import com.example.sd21201sof3022.buoi5.entity.SinhVien;
import com.example.sd21201sof3022.buoi5.service.SinhVienService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi5")
public class SinhVienController {
    SinhVienService sinhVienService = new SinhVienService();

    @GetMapping("/hien-thi")
    public String hienThi(Model model) {
        model.addAttribute("listSinhVien", sinhVienService.getAll());
        return "/buoi5/hien-thi";
    }

    @PostMapping("/them")
    public String them(SinhVien sinhVien) {
        sinhVienService.addSinhVien(sinhVien);
        return "redirect:/buoi5/hien-thi";
    }

    @GetMapping("/view-update/{id}")
    public String viewUpdate(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("sinhVien", sinhVienService.getSinhVienById(id));
        return "/buoi5/view-update";
    }

    @PostMapping("/sua")
    public String sua(SinhVien sinhVien) {
        sinhVienService.updateSinhVien(sinhVien);
        return "redirect:/buoi5/hien-thi";
    }

    @GetMapping("/xoa")
    public String xoa(@RequestParam("id") Integer id) {
        sinhVienService.removeSinhVien(id);
        return "redirect:/buoi5/hien-thi";
    }
}
