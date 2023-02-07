package com.example.mallcart.dto;

import com.example.mallcart.entity.Cart;
import lombok.Setter;

@Setter
public class CartDeletRequest {

    private int id;

    public Cart toEntity() {
        return Cart.builder().id(Long.valueOf(this.id))
                .build();
    }
}
