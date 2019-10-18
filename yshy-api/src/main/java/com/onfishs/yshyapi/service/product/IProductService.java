package com.onfishs.yshyapi.service.product;



import com.onfishs.yshycore.auth.entity.vo.Product;

import java.util.List;

public interface IProductService {
    Product get(long id);
    boolean add(Product product);
    List<Product> list();
}
