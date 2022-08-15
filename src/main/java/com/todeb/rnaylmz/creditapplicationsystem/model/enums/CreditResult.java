package com.todeb.rnaylmz.creditapplicationsystem.model.enums;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditScore;

public enum CreditResult {

    CONFIRMED(new CreditScore()),
    REJECTED(new CreditScore());

    private CreditScore creditScore;

    CreditResult(CreditScore creditScore){
        this.creditScore = creditScore;
    }

    public CreditScore getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(CreditScore creditScore) {
        this.creditScore = creditScore;
    }

}
