package com.eleal.springbootmicroservice1product.controller;

import com.eleal.springbootmicroservice1product.model.Product;
import com.eleal.springbootmicroservice1product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired(required = true)
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody Product product)
    {
        return new ResponseEntity<>(
                productService.saveProduct(product),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<?> getAllProduct()
    {
        return ResponseEntity.ok(productService.findAllProduct());
    }

    @DeleteMapping("{id}")
    public  ResponseEntity<?> deleteProduct(@PathVariable String id)
    {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
