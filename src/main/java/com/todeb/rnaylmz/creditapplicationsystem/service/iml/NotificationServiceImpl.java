package com.todeb.rnaylmz.creditapplicationsystem.service.iml;

import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditApplication;
import com.todeb.rnaylmz.creditapplicationsystem.model.enums.CreditResult;
import com.todeb.rnaylmz.creditapplicationsystem.service.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Override
    public String sendMessageForResult(CreditApplication creditApplication) {
        String resultMessage = "Your credit application has " + creditApplication.getCreditResult() ;
        if(creditApplication.getCreditResult() == CreditResult.CONFIRMED) {
            resultMessage += " and your credit limit is " + creditApplication.getCreditLimit() + " TL.";
        }

        return "Notification message is sent to " + creditApplication.getCustomer().getPhoneNumber() + " number with the message : " + resultMessage ;
    }
}
