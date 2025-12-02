package com.islamhamada.petshop.contracts.exception;

import lombok.Data;

@Data
public class FeignClientException extends ServiceException {
    private int httpStatus;

    public FeignClientException(String message, String error_code, int httpStatus){
        super(message, error_code);
        this.httpStatus = httpStatus;
    }
}
