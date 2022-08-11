package com.todeb.rnaylmz.creditapplicationsystem.model.dto;

import com.todeb.rnaylmz.creditapplicationsystem.model.enums.Role;
import lombok.Data;

import java.util.List;

@Data
public class UserResponseDTO {

    private Integer id;
    private String username;
    private String email;
    List<Role> roles;
}
