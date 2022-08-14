package com.todeb.rnaylmz.creditapplicationsystem.repository;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICreditApplicationRepository extends JpaRepository<Customer, String> {
}
