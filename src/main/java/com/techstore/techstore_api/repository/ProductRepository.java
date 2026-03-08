package com.techstore.techstore_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techstore.techstore_api.model.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {
    
}
