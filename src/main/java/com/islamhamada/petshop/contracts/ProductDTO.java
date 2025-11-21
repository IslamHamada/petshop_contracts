package com.islamhamada.petshop.contracts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private long id;

    private String name;

    private int quantity;

    private double price;

    private String description;

    private String image;

    private String for_animal;

    private String utility;
}
