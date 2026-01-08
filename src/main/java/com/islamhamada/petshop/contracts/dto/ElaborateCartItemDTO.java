package com.islamhamada.petshop.contracts.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ElaborateCartItemDTO {
    @PositiveOrZero
    private long product_id;
    @NotBlank
    private String product_name;
    @Positive
    private double product_price;
    private String product_image;
    @PositiveOrZero
    private long cart_item_id;
    @Positive
    private int cart_item_count;
}
