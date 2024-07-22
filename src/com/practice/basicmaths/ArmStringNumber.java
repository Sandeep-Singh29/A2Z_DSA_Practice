package com.practice.basicmaths;

public class ArmStringNumber {

    public static boolean isArmStrong(int num) {
        int dup = num;
        int result = 0;
        int countDigit = countDig(num);

        while (num > 0) {
            int last = num % 10;
            result += Math.pow(last, countDigit);
            num /= 10;
        }

        return dup == result;
    }

    public static int countDig(int num) {
        if (num == 0) return 1;
        return (int) (Math.log10(num) + 1);
    }


    public static void main(String[] args) {
        int num = 123;
        boolean bool = isArmStrong(num);
        System.out.println(bool);
        if (bool) {
            System.out.println("isArmStrong");
        } else {
            System.out.println("NOT isArmStrong");
        }

    }


}
