package com.islamhamada.petshop.contracts.exception;

import lombok.Data;

@Data
public abstract class GeneralException extends RuntimeException{
    private String error_code;

    protected GeneralException() {}

    protected GeneralException(String message, String error_code){
        super(message);
        this.error_code = error_code;
    }
}