package example.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiErrorHandler {

    private Logger log = Logger.getLogger(ApiErrorHandler.class);

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Error handleHttpRequestMethodNotSupportedException(
            HttpRequestMethodNotSupportedException ex) {

        log.error("Invalid Method", ex);

        return new Error(HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                "Entry Api with wrong method");
    }



}
