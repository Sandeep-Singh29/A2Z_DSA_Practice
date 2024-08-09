package com.practice.other;

import java.util.ArrayList;
import java.util.List;

public class FindSubArrayWithSum {
    public static void main(String[] args) {
        int []arr ={1,2,3,4,5,1,2,6,7,8,9};
        int target = 10;
        List<Integer> list = findSubArray(arr,target);
        System.out.println(list);
    }

    private static List<Integer> findSubArray(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();
        int sum =0;
        List<Integer> temp = new ArrayList<>();
        for(int v : arr){
                sum+=v;  //
                if(sum<=target){
                    list.add(v);
                }else{
                   sum =0;
                   if(temp.size()<list.size()){
                       temp = new ArrayList<>(list);
                       list = new ArrayList<>();
                   }
                }
        }
        long lis = list.stream().count();
        long tem = temp.stream().count();
        if(lis==target && temp.size()<list.size()){
            return list;
        }
        if(tem==target && list.size()<temp.size()){
            return temp;
        }
        return null;
    }
}
