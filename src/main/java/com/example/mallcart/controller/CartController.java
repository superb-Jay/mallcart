package com.example.mallcart.controller;


import com.example.mallcart.dto.CartAmountRequest;
import com.example.mallcart.dto.CartDeletRequest;
import com.example.mallcart.dto.CartResponseDTO;
import com.example.mallcart.repository.CartRepository;
import com.example.mallcart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/cart")
    public List<CartResponseDTO> selectCart() {
        return cartService.selectCart();
    }
    @DeleteMapping ("/cart")
    public String deleteCart(CartDeletRequest request) {
        return cartService.deleteCart(request);
    }

    @PatchMapping("cart/amount")
    public String amountCart(CartAmountRequest request) {
        return cartService.amountCart(request);
    }


}
