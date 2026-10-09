package com.example.sd21201sof3022.buoi11.repository;

import com.example.sd21201sof3022.buoi11.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanPhamRepository
    extends JpaRepository<SanPham, Integer> {
}
