package com.islamhamada.petshop.contracts.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ElaborateCartItemDTO {
    @Positive
    private long product_id;
    @NotBlank
    private String product_name;
    @Positive
    private double product_price;
    private String product_image;
    @Positive
    private long cart_item_id;
    @Positive
    private int cart_item_count;
}
