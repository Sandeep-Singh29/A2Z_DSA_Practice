package com.practice.other;

public class CalculateStringNumber {
    public static void main(String[] args) {
        String data = "asdfgh12345hgc876";
        int num = calculateNum(data);
        System.out.println(num);
    }

    private static int calculateNum(String data) {
        int count = 0;
        for (char c : data.toCharArray()) {
            if (!((int) c >= 97 && (int) c <= 122)) {
                int digit = Integer.parseInt(String.valueOf(c));
                count += digit;
            }
        }
        return count;
    }
}
