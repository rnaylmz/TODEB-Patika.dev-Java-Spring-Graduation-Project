package com.todeb.rnaylmz.creditapplicationsystem.service;


import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;

import javax.validation.Valid;

public interface CreditScoreService {

    boolean addScore( Customer customer);
}
