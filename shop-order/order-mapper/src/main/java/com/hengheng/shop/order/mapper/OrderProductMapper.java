package com.hengheng.shop.order.mapper;

import com.hengheng.shop.order.entity.OrderProduct;

import java.util.List;

public interface OrderProductMapper {

    List<OrderProduct> selectList();
}

