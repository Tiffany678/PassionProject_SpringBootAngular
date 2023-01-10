package com.yingjie.ecommerce.service;

import com.yingjie.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductService{

    Iterable<Product> getAllProducts();


    Product getProduct(long id);

    Product save(Product product);
}
