package com.example.sd21201sof3022.buoi11.service;

import com.example.sd21201sof3022.buoi11.entity.SanPham;
import com.example.sd21201sof3022.buoi11.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SanPhamService {
    @Autowired
    SanPhamRepository sanPhamRepository;

    public void themSanPham(SanPham sanPham) {
        sanPhamRepository.save(sanPham);
    }
}
