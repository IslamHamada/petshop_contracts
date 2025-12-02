package com.islamhamada.petshop.contracts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RestExceptionResponse {
    private String error_code;
    private String error_message;
}
