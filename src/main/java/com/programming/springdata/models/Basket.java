package com.programming.springdata.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "basket")
@NoArgsConstructor
@AllArgsConstructor
public class Basket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="users_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @Column(name = "quantity")
    private int quantity;


}
