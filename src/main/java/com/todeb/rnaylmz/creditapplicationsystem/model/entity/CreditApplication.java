package com.todeb.rnaylmz.creditapplicationsystem.model.entity;

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
    @Column(name = "credit_application_id", nullable = false)
    private String id;

    @Column(name = "credit_limit")
    private Double creditLimit;

    @Enumerated(EnumType.STRING)
    @Column(name = "credit_result")
    private CreditResult creditResult;


    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "application_date", updatable = false)
    private Date applicationDate;


    @NotNull(message = "cannot be credit application without customer")
    @JoinColumn(name = "identity_number", referencedColumnName = "identity_number")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    public CreditApplication(Double creditLimit, CreditResult creditResult, Customer customer) {
        this.creditLimit = creditLimit;
        this.creditResult = creditResult;
        this.customer = customer;
    }

    public CreditApplication(Customer customer){
        this.customer = customer;
    }
}
