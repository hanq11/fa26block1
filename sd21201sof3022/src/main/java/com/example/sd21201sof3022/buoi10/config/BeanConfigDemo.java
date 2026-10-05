package com.example.sd21201sof3022.buoi10.config;

import com.example.sd21201sof3022.buoi10.entity.CongTy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfigDemo {
    @Bean
    public CongTy createBean() {
        return new CongTy(1, "Poly");
    }

    @Bean
    @Primary
    public CongTy createBean1() {
        return new CongTy(2, "Viettel");
    }
}
