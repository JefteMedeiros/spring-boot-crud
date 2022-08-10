package com.deliveryproject.productmanagement.service;

import com.deliveryproject.productmanagement.productentity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<ProductEntity> listAllProducts();
    Optional<ProductEntity> findByRef(int Reference);
    ProductEntity registerProduct(ProductEntity productEntity);
    ProductEntity updateProduct(ProductEntity productEntity);
    void deleteProduct(int id);
}
