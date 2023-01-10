package com.yingjie.ecommerce;

import com.yingjie.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
       // SpringApplication.run(PassionProject.demo.DemoApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(...);
            // more products
        }
}
