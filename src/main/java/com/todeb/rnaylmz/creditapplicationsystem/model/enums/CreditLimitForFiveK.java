package com.todeb.rnaylmz.creditapplicationsystem.model.enums;

public enum CreditLimitForFiveK {
    LOW(10000),
    HIGH(20000),
    ;

    private int CreditLimit;
    CreditLimitForFiveK(int creditLimit) {

        CreditLimit = creditLimit;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        CreditLimit = creditLimit;
    }
}
