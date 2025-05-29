package com.practice.recrointerviewquestion;

/**
 * Author: Sandeep Singh
 * Date: 24/05/25
 */

public class SumofGoodNumbers_3452 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 5, 4};
        int k = 2;
        int sumOfGoodNumbers = sumOfGoodNumbers(nums, k);
        System.out.println(sumOfGoodNumbers);
    }

    public static int sumOfGoodNumbers(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            if (i - k >= 0 && nums[i] <= nums[i - k]) { // check index is > 0 & num[i] <= nums[i-k]
                flag = false;
            }
            if (i + k < nums.length && nums[i] <= nums[i + k]) {  // check index is < length of nums array & num[i] <= nums[i-k]
                flag = false;
            }
            if (flag) { // if true means good number is found and added into ans
                ans += nums[i];
            }
        }
        return ans;
    }

}
