package com.practice.array;

import java.util.*;
import java.util.stream.Collectors;

public class UnionOfTwoSortedList {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 5, 6};
        int arr2[] = {1, 4, 2, 6, 7};
        ArrayList<Integer> list = unionSortedList(arr1, arr2);
        System.out.println(list);
    }

    private static ArrayList<Integer> unionSortedList(int[] arr1, int[] arr2) {
       /* ArrayList<Integer> list = new ArrayList<>();
        for (int v : arr1) {
            if (!list.contains(v)) {
                list.add(v);
            }
        }
        for (int v : arr2) {
            if (!list.contains(v)) {
                list.add(v);
            }
        }
        Collections.sort(list);
        return list;*/

        ArrayList<Integer> list = new ArrayList<>(); //  1,2,3,5,6
        int ar1 = arr1.length;                       //  1,4,2,6,7
        int ar2 = arr2.length;
        int i = 0;
        int j = 0;
        while (i < ar1 && 0 < ar2) {
            if (arr1[i] <= arr2[j]) {
                if (list.isEmpty() || list.get(list.size()-1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if (arr1[i] >= arr2[j]) {
                    if (list.isEmpty() || list.get(list.size()-1) != arr2[j]) {
                        list.add(arr2[j]);
                    }
                    j++;
                }
            }
        }

        while (i < ar1) {
            if (list.isEmpty() || list.get(list.size()-1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }
        while (j < ar2) {
            if (list.isEmpty() || list.get(list.size()-1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }
        return list;
    }

}


