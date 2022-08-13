package com.todeb.rnaylmz.creditapplicationsystem.model.dto;

import com.todeb.rnaylmz.creditapplicationsystem.model.enums.Gender;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class CustomerDTO {

    private String identityNumber;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @NotBlank
    private String email;

    private Gender gender;
    private Integer age;
    private String phoneNumber;
    private Double salary;
}
