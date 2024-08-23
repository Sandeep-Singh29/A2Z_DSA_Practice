package com.practice.leetcode.string;

public class LargestOddNumber_1903 {

    public static String largestOddNumber(String num) {
       for(int i=num.length()-1;i>=0;i--){
           if(Character.getNumericValue(num.charAt(i)) %2!=0){
               return num.substring(0,i+1);
           }
       }
        return "";
    }

    public static void main(String[] args) {
        String num = "52";
        String string = largestOddNumber(num);
        System.out.println(string);
    }
}
