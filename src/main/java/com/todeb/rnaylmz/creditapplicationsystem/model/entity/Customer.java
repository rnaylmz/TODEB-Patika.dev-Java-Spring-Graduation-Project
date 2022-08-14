package com.todeb.rnaylmz.creditapplicationsystem.model.entity;


import com.todeb.rnaylmz.creditapplicationsystem.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@Entity
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @Column(name = "identity_number", length = 11, nullable = false)
    @NotBlank(message = "you have to enter your identity number")
    private String identityNumber;

    @NotBlank(message =  "you have to enter your name")
    private String firstName;

    @NotBlank(message =  "you have to enter your surname")
    private String lastName;

    @NotBlank(message =  "you have to enter your email")
    private String email;

    @Min(18)
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull(message =  "you have to enter your address")
    private String address;

    @NotNull(message =  "you have to enter your job")
    private String job;

    @NotNull(message =  "you have to enter your salary")
    @Column(name = "customer_salary")
    @Min(0)
    private Double salary;

    @NotBlank(message =  "you have to enter your phone number and please start without zero")
    @Max(10)
    private String phoneNumber;


    @OneToOne(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL)
    private CreditScore creditScore;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL)
    private CreditApplication creditApplications;

}
