package com.techstore.techstore_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techstore.techstore_api.model.Product;
import com.techstore.techstore_api.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product save(Product product){
        return repository.save(product);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}
