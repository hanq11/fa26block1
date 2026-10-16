package com.example.sd21201sof3022.buoi11.controller;

import com.example.sd21201sof3022.buoi11.entity.SanPham;
import com.example.sd21201sof3022.buoi11.repository.DanhMucRepository;
import com.example.sd21201sof3022.buoi11.repository.SanPhamRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/san-pham")
public class SanPhamController {
    @Autowired
    SanPhamRepository sanPhamRepository;

    @Autowired
    DanhMucRepository danhMucRepository;

    @GetMapping("/hien-thi")
    public String hienThi(Model model, @ModelAttribute("sanPham") SanPham sanPham) {
        model.addAttribute("listSanPham", sanPhamRepository.findAll());
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/sanPham/hien-thi";
    }

    @PostMapping("/them")
    public String themSanPham(@Valid @ModelAttribute("sanPham") SanPham sanPham
            , Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("listSanPham", sanPhamRepository.findAll());
            model.addAttribute("listDanhMuc", danhMucRepository.findAll());
            return "/sanPham/hien-thi";
        }
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

    @GetMapping("/find")
    public String findSanPham(@RequestParam("ten") String ten, Model model
            , @ModelAttribute("sanPham") SanPham sanPham // binh thuong khong can dong nay
    ) {
        model.addAttribute("listSanPham", sanPhamRepository.findSanPhamsByTenContains(ten));
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/sanPham/hien-thi";
    }

    @GetMapping("/phan-trang")
    public String phanTrang(@RequestParam(name = "page", defaultValue = "0", required = false) Integer page
            , Model model) {
        int pageSize = 2;
        Pageable pageable = PageRequest.of(page, pageSize);
        model.addAttribute("listSanPham", sanPhamRepository.findAll(pageable));
        model.addAttribute("listDanhMuc", danhMucRepository.findAll());
        return "/sanPham/phan-trang";
    }
}
