package com.dorotech.Dorotech.dto;

import com.dorotech.Dorotech.model.Product;

import java.math.BigDecimal;

public record ProductDTO(
        Long id,
        String name,
        String description,
        BigDecimal price,
        int amount
) {

    public ProductDTO(Product product) {
        this(product.getId(), product.getName(), product.getDescription(), product.getPrice(), product.getAmount());
    }

}
