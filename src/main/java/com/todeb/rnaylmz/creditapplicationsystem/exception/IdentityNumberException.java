package com.todeb.rnaylmz.creditapplicationsystem.exception;

public class IdentityNumberException {
    public class NationalIdAlreadyExistsException extends RuntimeException{
        public NationalIdAlreadyExistsException() {
            super("Customer who has this identity number is already exist.");
        }
    }
}
