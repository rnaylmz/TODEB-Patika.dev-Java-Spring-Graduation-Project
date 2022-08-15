package com.todeb.rnaylmz.creditapplicationsystem.service.iml;


import com.todeb.rnaylmz.creditapplicationsystem.exception.EntityNotFoundException;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import com.todeb.rnaylmz.creditapplicationsystem.repository.ICustomerRepository;
import com.todeb.rnaylmz.creditapplicationsystem.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Log4j2
public class CustomerServiceImpl implements CustomerService {

    private final ICustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {

        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomer(String identityNumber) {
        Optional<Customer> customer = customerRepository.findCustomerByIdentityNumber(identityNumber);
        return customer.orElseThrow(() -> new EntityNotFoundException("Customer"));

    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(String identityNumber, Customer customer) {
        Optional<Customer> currentCustomer = customerRepository.findCustomerByIdentityNumber(identityNumber);
        Customer updatedCustomer = currentCustomer.get();
        log.debug(customer.getIdentityNumber());
        if (!StringUtils.isEmpty(customer.getIdentityNumber())) {
            updatedCustomer.setIdentityNumber(customer.getIdentityNumber());
        }
        return customerRepository.save(updatedCustomer);
    }

    @Override
    public boolean deleteCustomer(String identityNumber) {
        customerRepository.delete(getCustomer(identityNumber));
        return true;
    }
}
