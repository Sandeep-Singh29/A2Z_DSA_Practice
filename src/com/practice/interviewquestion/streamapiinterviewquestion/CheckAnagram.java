package com.practice.interviewquestion.streamapiinterviewquestion;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */

public class CheckAnagram {

    public static void main(String[] args) {

        String data1 = "sandeep";
        String data2 = "deepsan";

        String ana1 = Arrays.stream(data1.split("")).sorted().collect(Collectors.joining());
        String ana2 = Arrays.stream(data2.split("")).sorted().collect(Collectors.joining());

        if(ana1.equals(ana2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }


    }

}
