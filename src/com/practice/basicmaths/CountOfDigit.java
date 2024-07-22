package com.practice.basicmaths;

public class CountOfDigit {

    public static int countDigit(int num) {
        int count = 0;
        while (num > 0) {
            int last = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 1234567;
        int count = countDigit(num);
        System.out.println("Using Integer : " + count);
        int c = usingString(num);
        System.out.println("Using String : " + c);
        int usingMathLog = usingMathLog(num);
        System.out.println("usingMathLog : "+usingMathLog);
    }

    public static int usingString(int num) {
        String string = String.valueOf(num);
        return string.length();
    }

    public static int usingMathLog(int n) {
        if (n == 0) return 1;
        return (int)(Math.log10(n) + 1);
    }

}
