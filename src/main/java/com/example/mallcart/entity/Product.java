package com.example.mallcart.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="prac_product")
@Builder
@Getter
@RequiredArgsConstructor
public class Product {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="intro")
    private String intro;

    @Column(name="contents")
    private String contents;

    @Column(name="image")
    private String image;

    @Column(name="size")
    private String size;

    @Column(name="color")
    private String color;

    @Column(name="price")
    private int price;
}