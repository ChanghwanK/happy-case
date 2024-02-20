package org.example.exceptionhappycase.exception;

public class BaseException extends RuntimeException {
    
    public BaseException() { }
    
    public BaseException(final String message) {
        super(message);
    }
}
