package com.practice.other;

public class DigitToBinaryAndCountZero {

    public static String convertToBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2;
            binary.append(remainder);
            number = number / 2;
        }
        return binary.reverse().toString();
    }

    private static int convertUsingMethod(int n) {
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '0') {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 4;
        String binary = convertToBinary(n);
        System.out.println("Binary representation is : " + binary);
        int count = convertUsingMethod(n);
        System.out.println("Zero Counts : " + count);
    }
}
