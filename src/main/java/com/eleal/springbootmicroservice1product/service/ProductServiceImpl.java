package com.eleal.springbootmicroservice1product.service;

import com.eleal.springbootmicroservice1product.model.Product;
import com.eleal.springbootmicroservice1product.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAllProduct()
    {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(String id){
        productRepository.deleteById(id);
    }
}
