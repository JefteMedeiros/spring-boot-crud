package com.deliveryproject.productmanagement.service.impl;

import com.deliveryproject.productmanagement.productentity.ProductEntity;
import com.deliveryproject.productmanagement.repository.ProductRepository;
import com.deliveryproject.productmanagement.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public EmployeeServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductEntity> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> findByRef(int Id) {
        return productRepository.findById(Id);
    }

    @Override
    public ProductEntity registerProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public ProductEntity updateProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
