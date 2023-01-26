package com.hjy.petShop.service;

import com.hjy.petShop.mapper.ProductMapper;
import com.hjy.petShop.vo.ProductVo;
import com.hjy.petShop.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper productMapper;

    public List<ProductVo> getProductList() {
        return productMapper.getProductList();
    }

    public ProductVo getProductId(Long id) {
        return productMapper.getProductId(id);
    }

    public ProductVo getProductName(String name) {
        return productMapper.getProductName(name);
    }

    public void insertProduct(ProductVo productVo) {
        productMapper.insertProduct(productVo);
    }

    public void updateProduct(ProductVo productVo) { // 상품 정보 수정
        productMapper.updateProduct(productVo);
    }

    public void deleteProduct(Long id) {
        productMapper.deleteProduct(id);
    }

}
