package com.deliveryproject.productmanagement.repository;

import com.deliveryproject.productmanagement.productentity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
