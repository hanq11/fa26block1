package com.example.sd21201sof3022.buoi11.repository;

import com.example.sd21201sof3022.buoi11.entity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    // JPA query method
    public List<SanPham> findSanPhamsByTenContains(String ten);
}
