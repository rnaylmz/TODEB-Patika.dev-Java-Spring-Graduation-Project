package com.todeb.rnaylmz.creditapplicationsystem.testservice;

import com.todeb.rnaylmz.creditapplicationsystem.repository.ICustomerRepository;
import com.todeb.rnaylmz.creditapplicationsystem.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Mock
    private ICustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @Test
    void getAllCustomers(){

    }


}
