package com.islamhamada.petshop.contracts.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String street;
    private String houseNumber;
    private String city;
    private String postalCode;
    private String country;
    private Instant createdAt;
    private String phoneNumber;
}
