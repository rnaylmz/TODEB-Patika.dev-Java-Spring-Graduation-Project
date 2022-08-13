package com.todeb.rnaylmz.creditapplicationsystem.repository;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findCustomerByIdentityNumber( String identityNumber);

    Customer getCustomerByIdentityNumber(String identityNumber);

}
