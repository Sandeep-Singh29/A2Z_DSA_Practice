package com.practice.leetcode;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int ar[] = {2,2,1,1,1,2,2,1};
        int num = majorElements(ar);
        System.out.println(num);
    }

    private static int majorElements(int[] ar) {
        int ele =0;
        int count =0;
        for(int v : ar){
            if(count==0){
                ele = v;
                count++;
            } else if (ele!=v) {
                count--;
            }else {
                count--;
            }
        }
        return ele;
    }
}
