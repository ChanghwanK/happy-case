package org.example.exceptionhappycase.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.example.exceptionhappycase.exception.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BaseException.class)
    public void handleBaseException(BaseException e) {
        log.error("BaseException occurred", e);
    }
}
