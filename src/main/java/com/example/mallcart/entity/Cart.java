package com.example.mallcart.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Builder
@Entity
@Table(name ="prac_cart")
@Getter
@RequiredArgsConstructor

public class Cart {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="amount")
    private int amount;

    @ManyToOne(targetEntity = Product.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "pro_id")
    private Product product;


}
