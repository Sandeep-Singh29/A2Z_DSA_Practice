package com.practice.basicrecursion;

public class StringPalindrom {
    public static void main(String[] args) {
        String name = "MADAM";
        int end = name.length() - 1;
        StringBuilder stringBuilder = new StringBuilder();
//        boolean data = reverseee(name, end, stringBuilder);
//        System.out.println(data);
        int i = 0;
        String data = "MADAMM";
        boolean bool = way2Check(i, data);
        System.out.println("Second Ways : " + bool);
    }

    private static boolean way2Check(int i, String data) {
        if (i >= data.length() / 2) return true;
        if (data.charAt(i) != data.charAt(data.length() - i - 1)) return false;
        return way2Check(i + 1, data);
    }

    private static boolean reverseee(String name, int end, StringBuilder stringBuilder) {
        if (end < 0) {
            if (stringBuilder.toString().equals(name)) {
                return true;
            }
            return false;
        }
        stringBuilder.append(name.charAt(end));
        reverseee(name, end - 1, stringBuilder);
        return stringBuilder.toString().equals(name) ? true : false;
    }
}
