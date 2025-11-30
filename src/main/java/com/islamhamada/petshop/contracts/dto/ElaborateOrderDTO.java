package com.islamhamada.petshop.contracts.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class ElaborateOrderDTO {
    private Instant time;
    private double price;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String country;
    private String city;
    private String street;
    private String postalCode;
    private String houseNumber;
    private List<ElaborateOrderItemDTO> elaborateOrderItems;
}
