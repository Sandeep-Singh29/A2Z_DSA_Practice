package com.practice.leetcode;

public class ReverseNumber_7 {
    public static void main(String[] args) {
        int num = -1234;
        int rev = reverse(num);
        System.out.println(rev);
    }

    private static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int last = x % 10;
            x = x / 10;
            if (rev > 0 && rev > (Integer.MAX_VALUE - last) / 10 || rev < 0 && rev < (Integer.MIN_VALUE - last) / 10)
                return 0;
            rev = rev * 10 + last;
        }
        return rev;
    }
}
