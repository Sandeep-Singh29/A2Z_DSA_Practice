package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author: SANDEEP
 * Date: 05-10-2024
 */

public class Finding2DigitEvenNumber_2094 {

    private static int[] findEvenNumbers(int[] digits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int v : digits) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        System.out.println(map);
//        for(int v : digits){
//            if(map.containsKey(v)){
//                map.put(v,map.get(v)+1);
//            }else{
//                map.put(v,1);
//            }
//        }
        System.out.println(map);
        List<Integer> set = new ArrayList<>();
        for (int i = 100; i <= 999; i += 2) {
            int val = i;
            int c = val % 10;
            val /= 10;
            int b = val % 10;
            val /= 10;
            int a = val;
            if (map.containsKey(a)) {
                int freA = map.get(a);
                map.put(a, freA - 1);
                if (freA == 1) map.remove(a);
                if (map.containsKey(b)) {
                    int freB = map.get(b);
                    map.put(b, freB - 1);
                    if (freB == 1) map.remove(b);
                    if (map.containsKey(c)) {
                        set.add(i);
                    }
                    map.put(b, freB);
                }
                map.put(a, freA);
            }
        }

        int res[] = new int[set.size()];
        int i = 0;
        for (int v : set) {
            res[i] = v;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] digits = {2, 1, 3, 0};
        int[] evenNumbers = findEvenNumbers(digits);
        System.out.println(Arrays.toString(evenNumbers));

    }

}