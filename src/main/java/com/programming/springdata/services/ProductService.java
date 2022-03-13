package com.programming.springdata.services;

import com.programming.springdata.models.Product;
import com.programming.springdata.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Integer id){
        return productRepository.findById(id);
    }

    public List<Product> findProductByName(String name){
        return productRepository.findByNameContaining("%"+name+"%");
    }

    public List<Product> findProductGreaterThanPrice(double price){
        return productRepository.findByPriceGreaterThan(price);
    }

    public List<Product> findProductGreaterLessPrice(double price){
        return productRepository.findByPriceLessThan(price);
    }




}
