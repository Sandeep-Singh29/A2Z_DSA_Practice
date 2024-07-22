package com.practice.basicmaths;

public class IterateNumberOneByOne {
    public static void main(String[] args) {
        int num = 123456;

        while (num > 0) {
            int last = num % 10;
            System.out.println(last);
            num = num / 10;
        }
    }
}
