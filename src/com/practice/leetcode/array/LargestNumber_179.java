package com.practice.leetcode.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LargestNumber_179 {

    private static String largestNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                String first = String.valueOf(nums[i]);
                String second = String.valueOf(nums[j]);
                String fs = first + second;
                String sf = second + first;
                int fsConcat = Integer.parseInt(fs);
                int sfConcat = Integer.parseInt(sf);
                if (fsConcat < sfConcat) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        String res = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
        if (res.startsWith("0") && res.endsWith("0")) {
            return "0";
        }
        return res;
    }


    private static String largestNumberway2(int[] nums) {
        int n = nums.length;
        String elements[] = new String[n];
        for (int i = 0; i < n; i++) { //N
            elements[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(elements, new Comparator<String>() {
            public int compare(String a, String b) {
                String first = a + b;
                String sec = b + a;
                return sec.compareTo(first); //K
            }
        });
        if (elements[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String val : elements) {
            sb.append(val);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int arr[] = {3, 30, 34, 5, 9}; // 334 343
//        String string = largestNumber(arr);
//        System.out.println(string);
        String string2 = largestNumberway2(arr);
        System.out.println(string2);


    }
}
