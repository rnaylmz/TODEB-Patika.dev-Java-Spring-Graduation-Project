package com.todeb.rnaylmz.creditapplicationsystem.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credit_score")
public class CreditScore implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;


    @NotNull
    private int creditScore;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "customer_credit_score", referencedColumnName = "credit_score")
    private Customer customer;

}

