package com.todeb.rnaylmz.creditapplicationsystem.service.iml;

import com.todeb.rnaylmz.creditapplicationsystem.model.CreditScoreRange;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditApplication;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditScore;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.ApplicationStatus;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.CreditLimit;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.CreditResult;
import com.todeb.rnaylmz.creditapplicationsystem.repository.ICreditApplicationRepository;
import com.todeb.rnaylmz.creditapplicationsystem.repository.ICreditScoreRepository;
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
    private final ICreditScoreRepository creditScoreRepository;
    private final ICustomerRepository customerRepository;
    private final NotificationService notificationService;

    @Override
    public boolean createApplication(String identityNumber) {
        Customer customer = customerRepository.getCustomerByIdentityNumber(identityNumber);
        if (customer.getCreditApplications().stream().anyMatch(creditApplication -> creditApplication.getApplicationStatus() == ApplicationStatus.PASSIVE)) {
            CreditApplication creditApplication = new CreditApplication();
            creditApplication.setCustomer(customer);
            creditApplication.setApplicationDate(new Date());
            customerRepository.save(creditApplication.getCustomer());
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

        } else if (CreditScoreRange.HIGH.contains(score.getCreditScore()) && salary < 5000){
            CreditLimit.LOW.ordinal();
        } else if (CreditScoreRange.HIGH.contains(score.getCreditScore()) && salary >5000){
           CreditLimit.HIGH.ordinal();
        }
    }

   /* @Override
    public void creditLimitIfApplicationIsConfirmed() {

    }

    @Override
    public void ifCreditLimitSpecial() {


    }*/



   /* public CreditResult applicationRejected(Integer creditScore) {
        if (CreditScoreRange.LOW.contains(creditScore)) {
            return CreditResult.REJECTED;
        }
        return null;
    }

    public CreditResult applicationConfirmedForFirstCondition(Integer creditScore, Integer salary) {
        if (CreditScoreRange.HIGH.contains(creditScore)) {
            return CreditResult.CONFIRMED;
        }
        return null;
    }

    public CreditResult applicationConfirmedForSecondCondition(Integer creditScore, Integer salary) {
        if (CreditScoreRange.HIGH.contains(creditScore)) {
            return CreditResult.CONFIRMED;
        }
        return null ;
    }*/

 /*  TODO 4 tane metot oluştur.
    check1
    kredi skoru 500 altı red
    check2
    kredi skoru 500-1000 arası ve maaşı 5k altı ise onay ve 10k limit
    check3
    kredi skoru 500-1000 arası ve maaşı 5k üstü ise onay ve 20k limit
    check4
    kredi skoru >= 1000 ise onay ve (aylık gelir*kredi skor çarpanı) limit

    herbir metodun içine bir karşılaştırma yap.
    */
}
