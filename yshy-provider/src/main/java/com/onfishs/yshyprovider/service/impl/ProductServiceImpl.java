package com.onfishs.yshyprovider.service.impl;

import com.onfishs.yshyapi.service.product.IProductService;
import com.onfishs.yshycore.auth.entity.vo.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {



    @Override
    public Product get(long id) {
        Product product = new Product();
        product.setProductId(id);
        product.setProductName("测试产品 : " + id);
        product.setProductDesc("测试产品");
        return product;
    }

    @Override
    public boolean add(Product product) {
        if(product.getProductId() == null){
            return false;
        }
        return true;
    }

    @Override
    public List<Product> list() {
        return new ArrayList<>();
    }
}
