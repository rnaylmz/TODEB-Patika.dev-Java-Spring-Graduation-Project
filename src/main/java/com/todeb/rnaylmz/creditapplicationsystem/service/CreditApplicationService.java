package com.todeb.rnaylmz.creditapplicationsystem.service;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditApplication;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;


public interface CreditApplicationService {

    public boolean createApplication(String identityNumber);

    public void checkApplicationIsConfirmedOrNot(CreditApplication application);

    public boolean deleteCreditApplication(Customer customer);

    public CreditApplication getCreditApplicationByIdentityNumber(String identityNumber);
}
