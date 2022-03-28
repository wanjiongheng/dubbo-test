package com.hengheng.shop.prod.service.api;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.hengheng.shop.prod.api.ProductGetListRequest;
import com.hengheng.shop.prod.entity.Product;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("product")
public interface ProductService {


    /***
     * 获取员工品牌列表
     * @param request
     * @return
     */
    @POST
    @Path("list")
    @Produces({ContentType.APPLICATION_JSON_UTF_8,ContentType.TEXT_XML_UTF_8})
    @Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
    List<Product> getList(ProductGetListRequest request);
}
