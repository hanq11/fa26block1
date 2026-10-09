package com.example.sd21201sof3022.buoi11.entity;

import jakarta.persistence.*;
import lombok.*;

//id INT IDENTITY(1,1) PRIMARY KEY,
//        ten NVARCHAR(200) NOT NULL,
//        gia INT,
//        tinh_trang BIT,
//        id_danh_muc INT FOREIGN KEY REFERENCES danh_muc(id)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "san_pham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten")
    private String ten;

    @Column(name = "gia")
    private Integer gia;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @ManyToOne
    @JoinColumn(name = "id_danh_muc", referencedColumnName = "id")
    private DanhMuc danhMuc;
}
