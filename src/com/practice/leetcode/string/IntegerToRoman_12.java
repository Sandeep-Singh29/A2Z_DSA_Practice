package com.practice.leetcode.string;

import java.util.*;

public class IntegerToRoman_12 {
    public static String intToRoman(int num) {
        List<String> r = Arrays.asList("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
        List<Integer> p = Arrays.asList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        int i=0;
        StringBuilder builder  = new StringBuilder();
        while (num>0){
            if(num>=p.get(i)){
                builder.append(r.get(i));
                num = num - p.get(i);
            }else{
                i++;
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        int num = 58;
        String string = intToRoman(num);
        System.out.println(string);
    }
}


/*

Map<Integer,String > map = new LinkedHashMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");
*/
