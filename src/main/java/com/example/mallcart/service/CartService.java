package com.example.mallcart.service;

import com.example.mallcart.dto.CartAmountRequest;
import com.example.mallcart.dto.CartDeletRequest;
import com.example.mallcart.dto.CartResponseDTO;

import java.util.List;

public interface CartService {
    public List<CartResponseDTO> selectCart();
    public String deleteCart(CartDeletRequest request);
    public String amountCart(CartAmountRequest request);
}
