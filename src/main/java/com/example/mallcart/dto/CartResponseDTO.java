package com.example.mallcart.dto;

import com.example.mallcart.entity.Cart;
import lombok.Getter;


@Getter
public class CartResponseDTO {

    private Long cartId;
    private int amount;

    private Long proId;
    private String intro;
    private String contents;
    private String image;
    private String color;
    private String size;
    private int price;

    public CartResponseDTO(Cart cart) {
        this.cartId = cart.getId();
        this.amount = cart.getAmount();
        this.proId = cart.getId();
        this.intro = cart.getProduct().getIntro();
        this.contents = cart.getProduct().getContents();
        this.image = cart.getProduct().getImage();
        this.color = cart.getProduct().getColor();
        this.size = cart.getProduct().getSize();
        this.price = cart.getProduct().getPrice();
    }
}
