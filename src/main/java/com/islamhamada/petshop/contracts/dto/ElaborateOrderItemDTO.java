package com.islamhamada.petshop.contracts.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ElaborateOrderItemDTO {
    @PositiveOrZero
    private long product_id;
    @NotBlank
    private String product_name;
    @Positive
    private double price;
    @Positive
    private long count;
}
