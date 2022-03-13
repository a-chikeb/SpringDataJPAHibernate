package com.programming.springdata.controller;

import com.programming.springdata.models.Product;
import com.programming.springdata.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {


    @Autowired
    private ProductService productService;


    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer id){
        return productService.getProductById(id);
    }


    @GetMapping("/search/name/{name}")
    public List<Product> searchProductByName(@PathVariable("name") String name){
        return productService.findProductByName(name);
    }

    @GetMapping("/search/price/greater/{price}")
    public List<Product> searchProductByPriceGreaterThan(@PathVariable("price") double price){
        return productService.findProductGreaterThanPrice(price);
    }

    @GetMapping("/search/price/less/{price}")
    public List<Product> searchProductByPriceLessThan(@PathVariable("price") double price){
        return productService.findProductGreaterLessPrice(price);
    }





}
