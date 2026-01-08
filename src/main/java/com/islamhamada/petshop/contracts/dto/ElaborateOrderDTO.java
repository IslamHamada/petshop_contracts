package com.islamhamada.petshop.contracts.dto;

import com.islamhamada.petshop.contracts.validator.PhoneNumberOrEmpty;
import com.islamhamada.petshop.contracts.validator.PostalCodeOrEmpty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ElaborateOrderDTO {
    @NotBlank
    private Instant time;
    @Positive
    private double price;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank @PhoneNumberOrEmpty
    private String phoneNumber;
    @NotBlank
    private String country;
    @NotBlank
    private String city;
    @NotBlank
    private String street;
    @NotBlank @PostalCodeOrEmpty
    private String postalCode;
    @NotBlank
    private String houseNumber;
    @NotBlank @Size(min = 1)
    private List<ElaborateOrderItemDTO> elaborateOrderItems;
}
