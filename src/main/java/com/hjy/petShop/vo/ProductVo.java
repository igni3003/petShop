package com.hjy.petShop.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductVo {
    private Long id;
    private String name;
    private Long price;
    private Long review;
    private Long stock;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date regdate;
}
