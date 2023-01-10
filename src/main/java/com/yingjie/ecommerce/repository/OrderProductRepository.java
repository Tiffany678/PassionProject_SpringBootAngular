package com.yingjie.ecommerce.repository;


import com.yingjie.ecommerce.model.OrderProduct;
import com.yingjie.ecommerce.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
