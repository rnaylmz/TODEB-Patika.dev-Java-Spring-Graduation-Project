package com.todeb.rnaylmz.creditapplicationsystem.repository;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditScore;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICreditScoreRepository extends JpaRepository<Customer, String> {

    CreditScore findCustomerByIdentityNumber(String identityNumber);

    //boolean addScore(Customer customer);

    CreditScore getCustomerByCreditScoreNotNull(CreditScore creditScore);

    CreditScore getCreditScoreByIdentityNumber(String identityNumber);


}
