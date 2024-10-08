package com.practice.leetcode.array;

import java.util.*;

public class Tree3Sum_15 {

    public static List<List<Integer>> threeSumBrute(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>(st);
        return res;
    }

    public static List<List<Integer>> tripletOptimal(int n, int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        if (n < 3) {
            return ans;
        }
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            //remove duplicates:
            if (i != 0 && arr[i] == arr[i - 1]) continue;
            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> threeSumOptimal(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(nums, i + 1, result, -nums[i]);
        }

        return result;
    }

    private static void twoSum(int[] nums, int k, List<List<Integer>> result, int target) {
        int i = k, j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                result.add(Arrays.asList(-target, nums[i], nums[j]));

                while (i < j && nums[i] == nums[i + 1]) {
                    i++;
                }
                while (i < j && nums[j] == nums[j - 1]) {
                    j--;
                }

                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};  // -4 -1 -1  0  1 2
//        List<List<Integer>> list = threeSumBrute(arr);
//        List<List<Integer>> list = tripletOptimal(arr.length, arr);
        List<List<Integer>> list = threeSumOptimal(arr);
        System.out.println(list);
    }
}
