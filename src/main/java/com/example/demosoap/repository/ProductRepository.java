package com.example.demosoap.repository;

import com.example.demosoap.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductModel, String> {
    ProductModel findByName(String name);
}