package com.todeb.rnaylmz.creditapplicationsystem.model.enums;
public enum  CreditResult {

    CONFIRMED(1000.0),
    REJECTED(500.0);

    private Double creditScore;
    CreditResult(Double creditScore){
        this.creditScore = creditScore;
    }

    public Double getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Double creditScore) {
        this.creditScore = creditScore;
    }
}
