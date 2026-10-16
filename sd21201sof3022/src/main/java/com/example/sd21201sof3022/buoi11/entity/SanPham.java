package com.example.sd21201sof3022.buoi11.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank(message = "Ten khong duoc de trong")
    @Column(name = "ten")
    private String ten;

    @Min(value = 8, message = "Gia khong duoc nho hon 8")
    @NotNull(message = "Gia khong duoc de trong")
    @Column(name = "gia")
    private Integer gia;

    @NotNull(message = "Tinh trang khong duoc de trong")
    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @NotNull(message = "Danh muc khong duoc de trong")
    @ManyToOne
    @JoinColumn(name = "id_danh_muc", referencedColumnName = "id")
    private DanhMuc danhMuc;
}
