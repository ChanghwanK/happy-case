package org.example.exceptionhappycase.exception;

public class BadInputValueException extends BaseException {
    private static final String DEFAULT_MESSAGE = "Bad input value";
    
    public BadInputValueException() {
        super(DEFAULT_MESSAGE);
    }
    
    public BadInputValueException(final String message) {
        super(message);
    }
}
