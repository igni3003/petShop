package com.hjy.petShop;

import com.hjy.petShop.mapper.ProductMapper;
import com.hjy.petShop.vo.ProductVo;
import com.hjy.petShop.vo.UserVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class MapperTests {
    @Autowired
    private ProductMapper productMapper;

    @Test
    void productMapperInsertTest() {
        ProductVo productVo = new ProductVo();
        productVo.setName("상품테스트2");
        productVo.setPrice(20000L);
        productVo.setReview(1L);
        productVo.setStock(200L);
        try {
            String regdate = "1993-08-05";
            SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date regDate = sdFormat.parse(regdate);
            productVo.setRegdate(regDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        productMapper.insertProduct(productVo);
    }

    @Test
    void productMapperUpdateTest() {
        ProductVo productVo = productMapper.getProductId(1L);
        productVo.setName("상품수정테스트");
        productVo.setPrice(20000L);
        productVo.setStock(300L);
        productMapper.updateProduct(productVo);
    }

    @Test
    void productMapperDeleteTest() {
        productMapper.deleteProduct(1L);
    }
}
