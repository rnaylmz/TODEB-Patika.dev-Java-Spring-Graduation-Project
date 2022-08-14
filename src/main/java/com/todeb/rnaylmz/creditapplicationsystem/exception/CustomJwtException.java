package com.todeb.rnaylmz.creditapplicationsystem.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class CustomJwtException extends Throwable {
    private final String message;
    private final HttpStatus httpStatus;
}
