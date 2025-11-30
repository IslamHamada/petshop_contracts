package com.islamhamada.petshop.contracts.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ElaborateOrderItemDTO {
    private long product_id;
    private String product_name;
    private double price;
    private long count;
}
