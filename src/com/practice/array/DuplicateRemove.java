package com.practice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateRemove {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int num = removeDuplicate(arr);
        System.out.println(num);
    }

    private static int removeDuplicate(int[] arr) {
        int j =0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr)+" : "+j);
        return j+=1;


       /*
        Set<Integer> set = new LinkedHashSet<>();
        for(int v : arr){
            set.add(v);
        }
        int i=0;
        for(int v : set){
            arr[i] = v;
            i++;
        }
        System.out.println(Arrays.toString(arr)+" : "+i);
        return i++;
        */
    }
}
