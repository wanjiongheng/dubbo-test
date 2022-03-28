package com.hengheng.shop.prod.service.imp;

import com.hengheng.shop.prod.api.ProductGetListRequest;
import com.hengheng.shop.prod.entity.Product;
import com.hengheng.shop.prod.mapper.ProductMapper;
import com.hengheng.shop.prod.service.api.ProductService;
import com.hengheng.shop.prod.service.inner.ProductInnerService;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
@Log4j
public class ProductServiceImp implements ProductService, ProductInnerService {

    @Autowired
    private ProductMapper productMapper;


    @Override
    public List<Product> getList(ProductGetListRequest request) {
        List<Product> products = productMapper.selectList();
        return products;
    }

    @Override
    public List<Product> getAllProduct() {
        log.error("---------> 进来了 -------------");
        return productMapper.selectList();
    }
}
