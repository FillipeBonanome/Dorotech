package com.dorotech.Dorotech.dto;

import java.math.BigDecimal;

public record ProductRegisterDTO(
        String name,
        String description,
        BigDecimal price,
        int amount
) {

}
