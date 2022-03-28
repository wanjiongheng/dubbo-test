package com.hengheng.shop.prod.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author  ceshi
 */
@Setter
@Getter
public class Product implements Serializable {

    private Long id;

    private String productName;

    private String code;
}
