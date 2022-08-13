package com.todeb.rnaylmz.creditapplicationsystem.model.mapper;

import com.todeb.rnaylmz.creditapplicationsystem.model.dto.CustomerDTO;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import org.mapstruct.*;

@Mapper
public interface CustomerMapper {
    public static CustomerDTO toDto(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setIdentityNumber(customer.getIdentityNumber());
        customerDTO.setFirstName(customer.getFirstName());
        customerDTO.setLastName(customer.getLastName());
        customerDTO.setPhoneNumber(customer.getPhoneNumber());
        customerDTO.setSalary(customer.getSalary());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setAge(customer.getAge());
        customerDTO.setGender(customer.getGender());
        return customerDTO;
    }
     public static Customer toEntity(CustomerDTO customerDTO){
         Customer customer = new Customer();
         customer.setIdentityNumber(customerDTO.getIdentityNumber());
         customer.setFirstName(customerDTO.getFirstName());
         customer.setLastName(customerDTO.getLastName());
         customer.setPhoneNumber(customerDTO.getPhoneNumber());
         customer.setSalary(customerDTO.getSalary());
         customer.setEmail(customerDTO.getEmail());
         customer.setAge(customerDTO.getAge());
         customer.setGender(customerDTO.getGender());
         return customer;
     }


}
