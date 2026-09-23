package com.example.sd21201sof3022.buoi5.service;

import com.example.sd21201sof3022.buoi5.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {
    List<SinhVien> danhSach = new ArrayList<>();

    public SinhVienService() {
        danhSach.add(new SinhVien(1, "Nguyen Van A", 9F, true));
        danhSach.add(new SinhVien(2, "Nguyen Thi B", 8F, false));
        danhSach.add(new SinhVien(3, "Tran Van C", 7F, true));
    }
    public List<SinhVien> getAll() {
        return danhSach;
    }
    public SinhVien getSinhVienById(Integer id) {
        for (SinhVien sv: danhSach) {
            if(sv.getId() == id) {
                return sv;
            }
        }
        return null;
    }
    public void addSinhVien(SinhVien sinhVien) {
        danhSach.add(sinhVien);
    }
    public void updateSinhVien(SinhVien sinhVien) {
        int indexToUpdate = -1;
        for(int i = 0; i < danhSach.size(); i++) {
            if(sinhVien.getId() == danhSach.get(i).getId()) {
                indexToUpdate = i;
            }
        }
        danhSach.set(indexToUpdate, sinhVien);
    }
    public void removeSinhVien(Integer id) {
        danhSach.removeIf(sinhVien -> sinhVien.getId() == id);
    }
}
