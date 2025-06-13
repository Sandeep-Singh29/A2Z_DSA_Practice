package com.practice.leetcode.binarysearch;

import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray_540 {

    public static int singleNonDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        return -1;
    }

    private static int singleNonDuplicateUsingXOR(int[] nums) {
        int ans =0;
        for(int i=0; i<nums.length; i++){
            ans = ans^nums[i];
        }
        return ans;
    }



    public static void main(String[] args) {
        int nums[] = {1,1,2,3,3,4,4,8,8};
//        int i = singleNonDuplicate(nums);
//        System.out.println(i);
        int i = singleNonDuplicateUsingBS(nums);
        int val = singleNonDuplicateWay2(nums);
        System.out.println(val);
        System.out.println(i);
        int usingXOR = singleNonDuplicateUsingXOR(nums);
        System.out.println(usingXOR);
    }

    private static int singleNonDuplicateWay2(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        while(l < h) {
            int mid = l + (h-l)/2;
            boolean isEven = (h-mid)%2 == 0;
            if(nums[mid] == nums[mid+1]) {
                if(isEven) {
                    l = mid+2;
                } else {
                    h = mid-1;
                }
            } else {
                if(isEven) {
                    h = mid;
                } else {
                    l = mid+1;
                }
            }
        }
        return nums[l];
    }


    private static int singleNonDuplicateUsingBS(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[high] != nums[high - 1]) return nums[high];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
