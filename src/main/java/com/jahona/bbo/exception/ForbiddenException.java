package com.jahona.bbo.exception;

import com.jahona.bbo.dto.exception.ErrorResponse;

public class ForbiddenException extends ParentException {
    private ErrorResponse errorMessage;

    public ForbiddenException(ErrorResponse errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorResponse getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "ForbiddenException{" +
                "errorMessage=" + errorMessage.getMap() +
                '}';
    }
}