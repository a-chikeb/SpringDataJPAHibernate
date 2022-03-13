package com.programming.springdata.repositories;

import com.programming.springdata.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findById(Integer id);

    //%in%%
    List<Product> findByNameContaining(String name);

    List<Product> findByPriceGreaterThan(double d);

    List<Product> findByPriceLessThan(double d);
}
