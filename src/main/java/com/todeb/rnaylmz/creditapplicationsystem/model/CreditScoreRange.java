package com.todeb.rnaylmz.creditapplicationsystem.model;


import com.todeb.rnaylmz.creditapplicationsystem.model.entity.CreditScore;
import org.springframework.data.domain.Range;

public class CreditScoreRange {

    public static final Range<Integer> LOW = Range.closed(0, 500);
    public static final Range<Integer> HIGH = Range.closed(501, 999);
    public static final Range<Integer> SPECIAL = Range.closed(1000, 2000);

}
