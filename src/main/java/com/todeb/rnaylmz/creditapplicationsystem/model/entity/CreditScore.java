package com.todeb.rnaylmz.creditapplicationsystem.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.CreditLimit;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.CreditResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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


    @JsonIgnore
    @Enumerated
    private CreditResult creditResult;

    @JsonIgnore
    @Enumerated(EnumType.STRING)
    private CreditLimit creditLimit;


  /*  TO-DO
  CreditScoreService
    kredi skoru 500 altı red
    kredi skoru 500-1000 arası ve maaşı 5k altı ise onay ve 10k limit
    kredi skoru 500-1000 arası ve maaşı 5k üstü ise onay ve 20k limit
    kredi skoru >= 1000 ise onay ve (aylık gelir*kredi skor çarpanı) limit*/


}

