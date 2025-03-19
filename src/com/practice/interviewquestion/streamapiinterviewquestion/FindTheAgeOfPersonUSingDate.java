package com.practice.interviewquestion.streamapiinterviewquestion;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */

public class FindTheAgeOfPersonUSingDate {
    public static void main(String[] args) {

        LocalDate birthDate = LocalDate.of(1995, 7, 29);
        LocalDate today = LocalDate.now();
        System.out.println(ChronoUnit.YEARS.between(birthDate, today));

    }
}
