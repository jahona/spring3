package com.jahona.bbo.exception;

import com.jahona.bbo.dto.exception.ErrorResponse;

public class UnauthorizeException extends ParentException {
    private ErrorResponse errorMessage;

    public UnauthorizeException(ErrorResponse errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "UnauthorizeException{" +
                "errorMessage=" + errorMessage.getMap() +
                '}';
    }
}