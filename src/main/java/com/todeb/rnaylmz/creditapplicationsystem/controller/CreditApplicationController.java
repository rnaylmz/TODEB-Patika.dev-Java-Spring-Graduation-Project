package com.todeb.rnaylmz.creditapplicationsystem.controller;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditApplication;
import com.todeb.rnaylmz.creditapplicationsystem.service.CreditApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/application")
public class CreditApplicationController {

    private CreditApplicationService creditApplicationService;

    @PostMapping(name = "/all")
    public ResponseEntity<CreditApplication> application(@Valid String identityNumber){

        return null;
    }





}
