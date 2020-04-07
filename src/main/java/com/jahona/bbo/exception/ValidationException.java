package com.jahona.bbo.exception;

import com.jahona.bbo.dto.exception.ErrorResponse;

public class ValidationException  extends ParentException {
    private ErrorResponse errorMessage;

    public ValidationException (ErrorResponse errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "ValidationException {" +
                "errorMessage=" + errorMessage.getMap() +
                '}';
    }
}