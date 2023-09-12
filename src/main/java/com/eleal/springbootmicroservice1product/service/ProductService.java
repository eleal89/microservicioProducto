package com.eleal.springbootmicroservice1product.service;

import com.eleal.springbootmicroservice1product.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> findAllProduct();

    void deleteProduct(String id);
}
