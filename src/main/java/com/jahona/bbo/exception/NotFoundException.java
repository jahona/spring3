package com.jahona.bbo.exception;

import com.jahona.bbo.dto.exception.ErrorResponse;

public class NotFoundException extends ParentException {
    private ErrorResponse errorMessage;

    public NotFoundException(ErrorResponse errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "NotFoundException{" +
                "errorMessage=" + errorMessage.getMap() +
                '}';
    }
}