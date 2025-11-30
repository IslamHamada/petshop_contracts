package com.islamhamada.petshop.contracts.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ElaborateOrderItemDTO {
    @Positive
    private long product_id;
    @NotBlank
    private String product_name;
    @Positive
    private double price;
    @Positive
    private long count;
}
