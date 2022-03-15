package com.programming.springdata.repositories;

import com.programming.springdata.models.Basket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasketRepository extends JpaRepository<Basket,Long> {
    List<Basket> findByUserId(Long userId);
}
