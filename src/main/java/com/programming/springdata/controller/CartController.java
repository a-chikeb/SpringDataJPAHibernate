package com.programming.springdata.controller;

import com.programming.springdata.models.Basket;
import com.programming.springdata.models.Product;
import com.programming.springdata.repositories.BasketRepository;
import com.programming.springdata.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {


    @Autowired
    private BasketRepository basketRepository;


    @GetMapping("/user/{user_id}")
    public List<Product> getProductBasketByUserId(@PathVariable("user_id") Integer id){

        List<Product> products = new ArrayList<>();

        List<Basket> baskets = basketRepository.findByUserId(Long.valueOf(id));

        for (Basket b:baskets) {
            System.out.println(b.getProduct());
            products.add(b.getProduct());
        }

        return products;
    }
}
