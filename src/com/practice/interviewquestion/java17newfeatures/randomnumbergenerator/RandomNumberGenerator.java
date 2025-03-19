package com.practice.interviewquestion.java17newfeatures.randomnumbergenerator;

import java.util.random.RandomGenerator;

/**
 * Author: Sandeep Singh
 * Date: 19/03/25
 */

public class RandomNumberGenerator {
    public static void main(String[] args) {
        RandomGenerator generator = RandomGenerator.of("L128X1024MixRandom");
        int randomNumber = generator.nextInt(1000); // range within number-1 >> 0-999
        System.out.println(randomNumber);
        // Generate a 6-digit number (between 100000 and 999999)
        int sixDigitNumber = generator.nextInt(100000, 1000000);
        System.out.println(sixDigitNumber);
    }
}
