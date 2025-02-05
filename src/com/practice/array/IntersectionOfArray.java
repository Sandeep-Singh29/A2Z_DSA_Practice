package com.practice.array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 3, 4, 5, 6};
        int arr2[] = {2, 3, 3, 5, 6, 6, 7};
//        List<Integer> list = interSection(arr1, arr2);
//        System.out.println(list);

        List<Integer> list1 = interSectionWay2(arr1, arr2);
        System.out.println(list1);
    }

    private static List<Integer> interSectionWay2(int[] arr1, int[] arr2) {
        List<Integer> lit = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                lit.add(arr1[i]);
                i++;
                j++;
            }
        }

        return lit;
    }

    private static List<Integer> interSection(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        int vis[] = new int[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && vis[j] == 0) {
                    list.add(arr2[j]);
                    vis[j] = 1;
                    break;
                }
            }
        }
        return list;
    }
}
