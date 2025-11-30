package com.islamhamada.petshop.contracts.dto;

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
public class ProductDTO {
    @Positive
    private long id;

    @NotBlank
    private String name;

    @Min(0)
    private int quantity;

    @Positive
    private double price;

    private String description;

    private String image;

    private String for_animal;

    private String utility;
}
