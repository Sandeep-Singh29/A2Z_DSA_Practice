package com.practice.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2_229 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 1, 2, 2, 2};
//        List<Integer> list = findMajorityElement(nums);
//        System.out.println(list);
//        List<Integer> list3 = majorityElement(nums);
//        System.out.println(list3);
        List<Integer> list3 = findMajorityElementOptimal(nums);
        System.out.println(list3);
    }


    private static List<Integer> findMajorityElementOptimal(int[] nums) {
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int len = nums.length;
        int size = len / 3;
        for (int i = 0; i < len; i++) {
            if (cnt1 == 0 && ele2 != nums[i]) {
                cnt1 = 1;
                ele1 = nums[i];
            } else if (cnt2 == 0 && ele1 != nums[i]) {
                cnt2 = 1;
                ele2 = nums[i];
            } else if (ele1 == nums[i]) {
                cnt1++;
            } else if (ele2 == nums[i]) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        int count2 = 0;
        int count1 = 0;
        for (int val : nums) {
            if (ele1 == val) count1++;
            if (ele2 == val) count2++;
        }
        if (count1 > size) list.add(ele1);
        if (count2 > size) list.add(ele2);
        return list;
    }

    public static List<Integer> majorityElement(int[] v) {
        int n = v.length;
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int mini = (int) (n / 3) + 1;
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
            if (mpp.get(v[i]) == mini) {
                ls.add(v[i]);
            }
            if (ls.size() == 2) break;
        }
        return ls;
    }

    private static List<Integer> findMajorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
//        List<Integer> filteredKeys = map.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() > nums.length / 3)
//                .map(Map.Entry::getKey)
//                .toList();
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > nums.length / 3) {
                list.add(m.getKey());
            }
        }
        return list;
    }
}

/*

public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 =0;
        int count2 =0;
        int ele1 = nums[0];
        int ele2 = nums[0];
        int size = (n/3);

        for(int i=0;i<n;i++){
            if(nums[i]==ele1){
                count1++;
            }else if(nums[i]==ele2){
                count2++;
            }else if(count1==0){
                ele1 =nums[i];
                count1 =1;
            }else if(count2==0){
                ele2 =nums[i];
                count2 =1;
            }else{
                 count1--;
                 count2--;
            }
        }

        int freq1 =0;
        int freq2 =0;
        for(int val : nums){
            if(ele1==val){
                freq1++;
            }else if(ele2 == val){
                freq2++;
            }
        }
        List<Integer> list = new ArrayList<>();
        if(freq1>size){
            list.add(ele1);
        }
        if(freq2>size){
            list.add(ele2);
        }
        return list;
    }

*/
