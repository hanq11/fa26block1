package com.example.sd21201sof3022.buoi11.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//
//CREATE TABLE danh_muc (
//        id INT IDENTITY(1,1) PRIMARY KEY,
//        ten NVARCHAR(100) ,
//        cap_do INT ,
//        he_so FLOAT ,
//        tinh_trang BIT
//        );
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "danh_muc")
public class DanhMuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "cap_do")
    private Integer capDo;

    @Column(name = "he_so")
    private Float heSo;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;
}
