package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangePositiveAndNegative1Skip_2149 {
    public static void main(String[] args) {
        int arr[] = {3, 1, -2, -5, 2, -4, -5, -2, -8, -4};  // 3, 1, -2, -5, 2, -4
//        int res[] = reArrange(arr);
//        System.out.println(Arrays.toString(res));
//        int res[] = reArrangeway2(arr);
//        System.out.println(Arrays.toString(res));
//        int res[] = reArrangeway3(arr);
//        System.out.println(Arrays.toString(res));
//        int res[] = reArrangeVariety2MyCode(arr);
//        System.out.println(Arrays.toString(res));
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));
        List<Integer> res = RearrangebySignVariery2(A, A.size());
        System.out.println(res);
    }

    public static ArrayList<Integer> RearrangebySignVariery2(ArrayList<Integer> A, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0)
                pos.add(A.get(i));
            else
                neg.add(A.get(i));
        }
        if (pos.size() < neg.size()) {
            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }
        else {
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }


    private static int[] reArrangeVariety2MyCode(int[] arr) {
        int[] res = new int[arr.length];
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        for (int val : arr) {
            if (val > 0) pos.add(val);
            else neg.add(val);
        }
        int min = Math.min(pos.size(), neg.size());
        for (int i = 0; i < min; i++) {
            res[2 * i] = pos.get(i);
            res[2 * i + 1] = neg.get(i);
        }
        int maxSize = Math.max(pos.size(), neg.size());
        int last = maxSize - min;
        int fetch = maxSize - last;
        int index = min * 2;
        if (pos.size() == maxSize) {
            while (fetch < maxSize) {
                res[index] = pos.get(fetch);
                fetch++;
                index++;
            }
        } else {
            while (fetch < maxSize) {
                res[index] = neg.get(fetch);
                fetch++;
                index++;
            }
        }
        return res;
    }

    private static int[] reArrangeway3(int[] arr) {
        int res[] = new int[arr.length];
        int pos = 0;
        int neg = 1;
        for (int j : arr) {
            if (j < 0) {
                res[neg] = j;
                neg += 2;
            } else {
                res[pos] = j;
                pos += 2;
            }
        }


        return res;
    }

    private static int[] reArrangeway2(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
        return arr;
    }

    private static int[] reArrange(int[] arr) {
        int res[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res[j] = arr[i];
                j += 2;
            }
        }
        j = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                res[j] = arr[i];
                j += 2;
            }
        }
        return res;
    }
}



/* int j=0;
        boolean posF = true;
        boolean negF = true;
        for(int i=0;i< arr.length;i++){
            if(i%2==0 && posF){
                arr[i] = pos.get(j);
                posF =false;
                negF = true;
            }
            if(i%2!=0 && negF){
                arr[i] = neg.get(j);
                posF =true;
                negF =false;
                j++;
            }
        }*/
