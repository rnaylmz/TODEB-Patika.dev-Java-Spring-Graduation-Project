package com.todeb.rnaylmz.creditapplicationsystem.model.entity;


import com.todeb.rnaylmz.creditapplicationsystem.model.enums.Gender;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.List;

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


    @OneToOne(fetch = FetchType.LAZY)
    private CreditScore creditScore;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CreditApplication> creditApplications;

   /* public Customer(String identityNumber, String firstName, String lastName, String email, Integer age, Gender gender, String address, String job, Double salary, String phoneNumber) {
        this.identityNumber = identityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.job = job;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }
*/
}
