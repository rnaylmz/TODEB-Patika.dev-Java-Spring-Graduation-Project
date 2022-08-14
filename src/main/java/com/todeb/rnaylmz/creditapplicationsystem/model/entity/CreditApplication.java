package com.todeb.rnaylmz.creditapplicationsystem.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.ApplicationStatus;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.CreditResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Builder
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credit_application")
public class CreditApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "credit_application_id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "credit_limit")
    private Double creditLimit;

    @Enumerated(EnumType.STRING)
    @Column(name = "credit_result")
    private CreditResult creditResult;

    @Enumerated(EnumType.STRING)
    private ApplicationStatus applicationStatus;


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "application_date", updatable = false)
    private Date applicationDate;


    @NotNull(message = "cannot be credit application without customer")
    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_identity_number", referencedColumnName = "identity_number")
    private Customer customer;

  /*  @OneToOne(fetch = FetchType.LAZY)
    private CreditScore creditScore;*/

    public CreditApplication( CreditResult creditResult, Customer customer, ApplicationStatus applicationStatus) {
        //this.creditLimit = creditLimit;
        this.creditResult = creditResult;
        this.customer = customer;
        this.applicationStatus = applicationStatus;
    }

    public CreditApplication(Customer customer){
        this.customer = customer;
    }

}
