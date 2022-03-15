package com.programming.springdata;

import com.programming.springdata.models.Product;
import com.programming.springdata.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }


    @Override
    public void run(String...args){
        /*
        productService.addProduct(new Product("product 1",1000.0,4));
        productService.addProduct(new Product("product 2",2000.0,4));
        productService.addProduct(new Product("product 3",3000.0,4));
        productService.addProduct(new Product("product 4",4000.0,4));
        */

    }

}
