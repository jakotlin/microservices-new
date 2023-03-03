package ru.jakotlin.productservice.repository;

import ru.jakotlin.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String> {
}
