package com.practice.basicmaths;

public class ReverseNumber {

    public static int reverse(int num) {
        StringBuilder builder = new StringBuilder();
        boolean flagLast = false;
        while (num > 0) {
            int last = num % 10;
            if (last != 0 || flagLast) {
                builder.append(String.valueOf(last));
                flagLast = true;
            }
            num = num / 10;
        }
        return Integer.parseInt(builder.toString());
    }

    public static int reverseUsingNoConversion(int num) {
        int rev =0;
        while (num > 0) {
            int last = num % 10;
            rev = (rev*10)+last;
            num = num / 10;
        }
        return rev;
    }


    public static void main(String[] args) {
        int num = 8969000;
        int reverse = reverse(num);
        System.out.println(reverse);
        int i = reverseUsingNoConversion(num);
        System.out.println(i);

    }
}
