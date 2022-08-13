package com.todeb.rnaylmz.creditapplicationsystem.service;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditApplication;


public interface CreditApplicationService {

    //TODO


    public boolean createApplication(String identityNumber);

    public void checkApplicationIsConfirmedOrNot(CreditApplication application);

   /* public void  creditLimitIfApplicationIsConfirmed();

    public void ifCreditLimitSpecial();
*/

}
