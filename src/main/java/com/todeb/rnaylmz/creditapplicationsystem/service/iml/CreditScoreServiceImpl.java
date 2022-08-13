package com.todeb.rnaylmz.creditapplicationsystem.service.iml;

import com.todeb.rnaylmz.creditapplicationsystem.exception.EntityNotFoundException;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditScore;
import com.todeb.rnaylmz.creditapplicationsystem.model.entity.Customer;
import com.todeb.rnaylmz.creditapplicationsystem.repository.ICreditScoreRepository;
import com.todeb.rnaylmz.creditapplicationsystem.service.CreditScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.SplittableRandom;

@RequiredArgsConstructor
@Service
@Component
public class CreditScoreServiceImpl implements CreditScoreService {

    private ICreditScoreRepository creditScoreRepository;


    @Override
    public boolean addScore(Customer customer) {

        //TODO random kredi skoru hesabı
        SplittableRandom splittableRandom = new SplittableRandom();
        int randomWithSplittableRandom = splittableRandom.nextInt(1, 2000);
        CreditScore creditScore = new CreditScore();
        creditScore.setCreditScore(randomWithSplittableRandom);
        creditScore.setCustomer(customer);
        creditScoreRepository.getCustomerByCreditScoreNotNull(creditScore);
        return true;
    }

    //@Override
    //public CreditScore getCreditScoreByIdentityNumber(String identityNumber) {}


}
