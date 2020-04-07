package com.jahona.bbo.exception;

import com.jahona.bbo.dto.exception.ErrorResponse;

public class ConflictException extends ParentException {
    private ErrorResponse errorMessage;

    public ConflictException(ErrorResponse errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "ConflictException{" +
                "errorMessage=" + errorMessage.getMap() +
                '}';
    }
}