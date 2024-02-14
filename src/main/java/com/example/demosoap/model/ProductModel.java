package com.example.demosoap.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("products")
@Getter
@Setter
public class ProductModel {
    @Id
    private String id;
    private String name;
    private double price;
    private String description;

}
