package com.deliveryproject.productmanagement.controller;

import com.deliveryproject.productmanagement.productentity.ProductEntity;
import com.deliveryproject.productmanagement.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductEntity> listAllProducts() {
        return productService.listAllProducts();
    }

    @GetMapping("/{Id}")
    public Optional<ProductEntity> findById(@PathVariable("Id") int Id) {
        return productService.findById(Id);
    }

    @PostMapping
    public ProductEntity saveProduct(@RequestBody ProductEntity productEntity) {
        return productService.registerProduct(productEntity);
    }

    @PutMapping
    public ProductEntity updateProduct(@RequestBody ProductEntity productEntity) {
        return productService.updateProduct(productEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") int id) {
        productService.deleteProduct(id);
    }
}
