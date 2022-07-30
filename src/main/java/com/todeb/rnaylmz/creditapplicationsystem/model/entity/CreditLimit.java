package com.todeb.rnaylmz.creditapplicationsystem.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CreditLimit implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String id;
}
