package com.practice.gfg.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingAndRepeating {
    public static int[] findTwoElement(int arr[]) {
        List<Integer> list = new ArrayList<>();
        int start = 1;
        for (int i = 1; i < arr.length; i++) {
                if(arr[i-1]!=start){
                    list.add(start);
                }
               start++;
            if (arr[i - 1] == arr[i]) {
                list.add(arr[i - 1]);
            }
        }
        int res[] = new int[list.size()];
        int j=0;
        for (int i=list.size()-1; i>=0 ;i--) {
            res[j] = list.get(i);
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2,2};
        int[] twoElement = findTwoElement(arr);
        System.out.println(Arrays.toString(twoElement));
    }
}
