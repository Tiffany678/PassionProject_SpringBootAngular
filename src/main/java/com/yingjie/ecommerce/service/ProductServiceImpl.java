package com.yingjie.ecommerce.service;

import com.yingjie.ecommerce.model.Product;
import com.yingjie.ecommerce.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    // productRepository constructor injection
    ProductRepository productRepository;

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}