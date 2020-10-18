package com.cenfotec.accessingdatamongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Customer, String> {

    public Product getProductByName(String name);
    public List<Product> getAllProducts();

}
