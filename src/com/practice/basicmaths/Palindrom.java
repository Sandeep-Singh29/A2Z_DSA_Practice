package com.practice.basicmaths;

public class Palindrom {


    public static boolean palindrom(int num) {
        int orginal = num;
        int rev = 0;
        while (num > 0) {
            int last = num % 10;
            rev = (rev * 10) + last;
            num = num / 10;
        }
        if (orginal != rev) return false;
        return true;
    }

    public static void main(String[] args) {
        int num = 121;
        boolean pal = palindrom(num);
        if (pal) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
