package com.todeb.rnaylmz.creditapplicationsystem.testservice;


import com.todeb.rnaylmz.creditapplicationsystem.repository.ICreditApplicationRepository;
import com.todeb.rnaylmz.creditapplicationsystem.service.CreditApplicationService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class CreditApplicationServiceTest {
    @Mock
    private ICreditApplicationRepository creditApplicationRepository;

    @InjectMocks
    private CreditApplicationService creditApplicationService;

   @Test
    void getAllCreditApplications() {

   }
}
