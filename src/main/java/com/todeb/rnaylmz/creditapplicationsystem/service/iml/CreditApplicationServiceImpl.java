package com.todeb.rnaylmz.creditapplicationsystem.service.iml;

import com.todeb.rnaylmz.creditapplicationsystem.model.CreditScoreRange;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditApplication;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditScore;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.ApplicationStatus;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.CreditLimitForFiveK;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.CreditResult;
import com.todeb.rnaylmz.creditapplicationsystem.repository.ICreditApplicationRepository;
import com.todeb.rnaylmz.creditapplicationsystem.repository.ICustomerRepository;
import com.todeb.rnaylmz.creditapplicationsystem.service.CreditApplicationService;
import com.todeb.rnaylmz.creditapplicationsystem.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class CreditApplicationServiceImpl implements CreditApplicationService {

    private final ICreditApplicationRepository creditApplicationRepository;

    private final ICustomerRepository customerRepository;

    private final NotificationService notificationService;

    @Override
    public boolean createApplication(String identityNumber) {
        Customer customer = customerRepository.getCustomerByIdentityNumber(identityNumber);
        if (customer.getCreditApplications().equals(ApplicationStatus.PASSIVE)) {
            CreditApplication creditApplication = new CreditApplication();
            creditApplication.setCustomer(customer);
            creditApplication.setApplicationDate(new Date());
            creditApplicationRepository.save(creditApplication.getCustomer());
        }
        return true;
    }

    @Override
    public void checkApplicationIsConfirmedOrNot(CreditApplication application) {
        Customer checkCustomerForApplication = application.getCustomer();
        CreditScore score = checkCustomerForApplication.getCreditScore();
        Double salary = checkCustomerForApplication.getSalary();
        final int creditMultiplier = 4;
        if (CreditScoreRange.LOW.contains(score.getCreditScore())) {
            application.setCreditResult(CreditResult.REJECTED);

        } else if (CreditScoreRange.SPECIAL.contains(score.getCreditScore())) {
            CreditApplication.builder().creditLimit(salary * creditMultiplier);
            application.setCreditResult(CreditResult.CONFIRMED);

        } else if (CreditScoreRange.HIGH.contains(score.getCreditScore()) && (salary > 5000)) {
            CreditLimitForFiveK.HIGH.getCreditLimit();
            application.setCreditResult(CreditResult.CONFIRMED);
        } else {
            CreditLimitForFiveK.LOW.getCreditLimit();
            application.setCreditResult(CreditResult.CONFIRMED);
        }
    }

    @Override
    public boolean deleteCreditApplication(Customer customer) {
        if (customer.getCreditApplications().getCreditResult().equals(CreditResult.CONFIRMED)) {
            creditApplicationRepository.delete(customer);
        }
        return true;
    }

}
