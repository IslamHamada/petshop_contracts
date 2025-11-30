package com.islamhamada.petshop.contracts.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartItemDTO {
    @Positive
    private long id;
    @Positive
    private long user_id;
    @Positive
    private long product_id;
    @Positive
    private int count;
}
