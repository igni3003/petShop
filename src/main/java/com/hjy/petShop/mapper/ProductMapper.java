package com.hjy.petShop.mapper;

import com.hjy.petShop.vo.ProductVo;
import com.hjy.petShop.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductVo> getProductList();
    ProductVo getProductId(Long id);
    ProductVo getProductName(String name);
    ProductVo getProductStock(Long stock);
    ProductVo getProductReview(Long review);
    void insertProduct(ProductVo productVo);
    void updateProduct(ProductVo productVo);
    void deleteProduct(Long id);
}
