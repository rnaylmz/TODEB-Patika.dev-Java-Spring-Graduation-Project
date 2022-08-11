package com.todeb.rnaylmz.creditapplicationsystem.model.enums;

public enum CreditLimit {

    First_condition(10000.0,5000.0),
    Second_condition (20000.0, 5000.0),
    Special_condition (0.0,0.0);


    private Double creditLimit;
    private Double salaryLimit;

    CreditLimit(Double creditLimit, Double salaryLimit){
        this.creditLimit = creditLimit;
        this.salaryLimit = salaryLimit;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Double getSalaryLimit() {
        return salaryLimit;
    }

    public void setSalaryLimit(Double salaryLimit) {
        this.salaryLimit = salaryLimit;
    }
}
