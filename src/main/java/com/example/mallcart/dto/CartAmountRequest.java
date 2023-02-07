package com.example.mallcart.dto;

import com.example.mallcart.entity.Cart;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CartAmountRequest {

    private int id;
    private String act;


    public Cart toEntity() {
        return Cart.builder().id(Long.valueOf(this.id))
                .build();
    }
}
