package com.todeb.rnaylmz.creditapplicationsystem.controller;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditApplication;
import com.todeb.rnaylmz.creditapplicationsystem.service.CreditApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/application")
public class CreditApplicationController {

    private CreditApplicationService creditApplicationService;

    @PostMapping(name = "/add/{identityNumber}")
    public Boolean createApplication(@PathVariable String identityNumber){
        return creditApplicationService.createApplication(identityNumber);
    }

    @GetMapping(name = "/get/{identityNumber}")
    public CreditApplication getApplication(@PathVariable String identityNumber){
        return creditApplicationService.getCreditApplicationByIdentityNumber(identityNumber);
    }
}
