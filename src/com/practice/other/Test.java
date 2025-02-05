package com.practice.other;

public class Test {

    public static void main(String[] args) {
//        String name = "abcdbef";
        int arr[] = {1, 2, 3, 4, 5, 7, 7, 7};
        int i = sortByDesending(arr
        );
        System.out.println(i);
    }

    private static int sortByDesending(int[] s) {
        int largest = 0;
        int second = -1;
        for (int i = 0; i < s.length; i++) {
            if (s[i] > largest) {
                second = largest;
                largest = s[i];
            }
            if (s[i] > second && s[i] != largest) {
                second = s[i];
            }
        }


        System.out.println("largest : " + largest + " : " + second);
        return largest;
    }
}
        