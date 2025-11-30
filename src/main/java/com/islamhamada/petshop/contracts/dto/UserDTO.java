package com.islamhamada.petshop.contracts.dto;

import com.islamhamada.petshop.contracts.validator.PhoneNumberOrEmpty;
import com.islamhamada.petshop.contracts.validator.PostalCodeOrEmpty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
    @NotBlank
    private String username;
    @NotBlank @Email
    private String email;
    private String firstName;
    private String lastName;
    private String street;
    private String houseNumber;
    private String city;
    @PostalCodeOrEmpty
    private String postalCode;
    private String country;
    @NotBlank
    private Instant createdAt;
    @PhoneNumberOrEmpty
    private String phoneNumber;
}
