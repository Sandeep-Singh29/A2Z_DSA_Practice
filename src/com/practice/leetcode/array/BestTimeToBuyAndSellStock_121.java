package com.practice.leetcode.array;

public class BestTimeToBuyAndSellStock_121 {
    private static int maxProfit(int[] prices) {
        int maxPro = 0;
        int buy = prices[0];
        for (int v : prices) {
            if (buy > v) {
                buy = v;
            }
            int sell = v - buy;
            maxPro = Math.max(sell, maxPro);
        }
        return maxPro;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(arr);
        System.out.println(maxProfit);
    }
}
