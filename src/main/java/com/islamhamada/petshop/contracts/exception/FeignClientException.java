package com.islamhamada.petshop.contracts.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class FeignClientException extends ServiceException {
    private HttpStatus httpStatus;

    public FeignClientException(String message, String error_code, HttpStatus httpStatus){
        super(message, error_code);
        this.httpStatus = httpStatus;
    }
}
