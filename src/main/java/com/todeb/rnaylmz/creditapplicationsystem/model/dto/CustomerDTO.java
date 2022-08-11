package com.todeb.rnaylmz.creditapplicationsystem.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class CustomerDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String surName;

    @NotBlank
    private String email;

    private String gender;
    private Integer age;
    private Long phone;
}
