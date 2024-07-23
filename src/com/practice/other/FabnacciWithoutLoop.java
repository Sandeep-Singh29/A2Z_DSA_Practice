package com.practice.other;

public class FabnacciWithoutLoop {

    public static void main(String[] args) {
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        StringBuilder stringBuilder = new StringBuilder();
        String data = callFabnacci(n, n1, n2, stringBuilder);
        System.out.println(data);
    }

    private static String callFabnacci(int n, int n1, int n2, StringBuilder builder) {
        if (n == 0) {
            return builder.toString();
        }
        builder.append(n1).append(" ");
        int sum = n1 + n2;
        n1 = n2;
        n2 = sum;
        return callFabnacci(n - 1, n1, n2, builder);
    }
}

//0,1,1,2,3,5,8,13,21
