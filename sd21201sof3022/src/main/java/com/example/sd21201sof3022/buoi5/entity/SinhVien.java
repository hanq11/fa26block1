package com.example.sd21201sof3022.buoi5.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {
    private Integer id;
    private String ten;
    private Float diem;
    private Boolean gioiTinh;
}
