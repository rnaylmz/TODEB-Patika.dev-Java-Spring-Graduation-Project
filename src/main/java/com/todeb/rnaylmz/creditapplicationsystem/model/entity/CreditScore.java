package com.todeb.rnaylmz.creditapplicationsystem.model.entity;

import com.todeb.rnaylmz.creditapplicationsystem.model.CreditScoreRange;
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
    @Column(name = "credit_score")
    private int creditScore;

    @NotNull
    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "customer_identity_number", referencedColumnName = "identity_number")
    private Customer customer;

    /*@NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @Column(name = "credit_score_range", )
    private CreditScoreRange creditScoreRange;*/

}

