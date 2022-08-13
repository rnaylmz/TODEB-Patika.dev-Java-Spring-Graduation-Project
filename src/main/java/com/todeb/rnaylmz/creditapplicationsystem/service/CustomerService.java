package com.todeb.rnaylmz.creditapplicationsystem.service;


import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

public interface CustomerService{

    List<Customer> getAllCustomer();

    Customer getCustomer(String identityNumber);

    void createCustomer(@Valid Customer customer);

    Customer updateCustomer(final String identityNumber, final Customer customer);

    boolean deleteCustomer(String identityNumber);



}
