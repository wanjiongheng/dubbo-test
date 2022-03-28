package com.hengheng.shop.order.service.imp;

import com.hengheng.shop.order.api.ProductGetListRequest;
import com.hengheng.shop.order.entity.OrderProduct;
import com.hengheng.shop.order.service.api.OrderProductService;
import com.hengheng.shop.prod.entity.Product;
import com.hengheng.shop.prod.service.inner.ProductInnerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service("orderProductService")
public class OrderProductServiceImp implements OrderProductService {

    @Autowired
    private ProductInnerService productService;

    @Override
    public List<OrderProduct> getList(ProductGetListRequest request) {
        List<Product> allProduct = productService.getAllProduct();
        List<OrderProduct> productList = new ArrayList<>();
        for (Product p : allProduct) {
            OrderProduct product = new OrderProduct();
            BeanUtils.copyProperties(p, product);
            productList.add(product);
        }
        return productList;
    }
}
