package com.GT.Day24.ExceptionDemo;

public class AgeFormatException extends RuntimeException{
    public AgeFormatException() {
    }

    public AgeFormatException(String message) {
        super(message);
    }
}
