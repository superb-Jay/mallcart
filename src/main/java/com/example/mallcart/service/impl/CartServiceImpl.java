package com.example.mallcart.service.impl;

import com.example.mallcart.dto.CartAmountRequest;
import com.example.mallcart.dto.CartDeletRequest;
import com.example.mallcart.dto.CartResponseDTO;
import com.example.mallcart.entity.Cart;
import com.example.mallcart.repository.CartRepository;
import com.example.mallcart.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public List<CartResponseDTO> selectCart() {
        List<Cart> cartList = cartRepository.findAll();
        return cartList.stream()
                .map(CartResponseDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public String deleteCart(CartDeletRequest request) {
        try {
            cartRepository.delete(request.toEntity());
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String amountCart(CartAmountRequest request) {
        Optional<Cart> cartbyId = cartRepository.findById(Long.valueOf(request.getId()));
        Cart cartFound = cartbyId.get();

        try {

            if (request.getAct().equals("plus")) {
                cartFound.setAmount(cartFound.getAmount() + 1);
                cartRepository.save(cartFound);
            } else {
                if (cartFound.getAmount() > 1) {
                    cartFound.setAmount(cartFound.getAmount() - 1);
                    cartRepository.save(cartFound);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }
}
