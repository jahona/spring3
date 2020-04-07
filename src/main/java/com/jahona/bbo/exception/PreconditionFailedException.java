package com.jahona.bbo.exception;

import com.jahona.bbo.dto.exception.ErrorResponse;

public class PreconditionFailedException extends ParentException {
    private ErrorResponse errorMessage;

    public PreconditionFailedException(ErrorResponse errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "PreconditionFailedException{" +
                "errorMessage=" + errorMessage.getMap() +
                '}';
    }
}