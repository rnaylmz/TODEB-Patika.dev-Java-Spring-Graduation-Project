package com.todeb.rnaylmz.creditapplicationsystem.exception;

import lombok.Data;

@Data
public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(String entityName) {
        super("Related " + entityName + " not found with : " );
    }

}
