package com.todeb.rnaylmz.creditapplicationsystem.controller;

import com.todeb.rnaylmz.creditapplicationsystem.model.dto.CustomerDTO;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import com.todeb.rnaylmz.creditapplicationsystem.model.mapper.CustomerMapper;
import com.todeb.rnaylmz.creditapplicationsystem.service.CustomerService;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;




@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/all")
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> allCustomers = customerService.getAllCustomer();
        return allCustomers.stream().map(CustomerMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{identityNumber}")
    public CustomerDTO getCustomer(@PathVariable String identityNumber){
        return CustomerMapper.toDto(customerService.getCustomer(identityNumber));
    }

    @PostMapping("/create")
    public void saveCustomer(@Valid @RequestBody CustomerDTO customer){
        customerService.createCustomer(CustomerMapper.toEntity(customer));
    }

    @PutMapping("/update/{identityNumber}")
    public CustomerDTO updateCustomer(@PathVariable final String identityNumber,
                                      @Valid @RequestBody CustomerDTO customerDTO){
        return CustomerMapper.toDto(customerService.updateCustomer(identityNumber, CustomerMapper.toEntity(customerDTO)));
    }

    @DeleteMapping("/delete")
    public boolean deleteCustomer(@RequestParam String identityNumber){
        return customerService.deleteCustomer(identityNumber);
    }



}
