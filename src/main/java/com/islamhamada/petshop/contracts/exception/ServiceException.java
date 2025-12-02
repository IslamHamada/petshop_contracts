package com.islamhamada.petshop.contracts.exception;

import lombok.Data;

@Data
public abstract class ServiceException extends RuntimeException{
    private String error_code;

    protected ServiceException() {}

    protected ServiceException(String message, String error_code){
        super(message);
        this.error_code = error_code;
    }
}