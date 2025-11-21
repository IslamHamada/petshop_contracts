package com.islamhamada.petshop.contracts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ElaborateCartItemDTO {
    private long product_id;
    private String product_name;
    private double product_price;
    private String product_image;
    private long cart_item_id;
    private int cart_item_count;
}
