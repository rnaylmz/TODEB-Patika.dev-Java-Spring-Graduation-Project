package com.todeb.rnaylmz.creditapplicationsystem.model.enums;

public enum CreditLimit {
    LOW(10000),
    HIGH(20000),
    ;

    private int CreditLimit;
    CreditLimit(int creditLimit) {
        CreditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        CreditLimit = creditLimit;
    }
}
