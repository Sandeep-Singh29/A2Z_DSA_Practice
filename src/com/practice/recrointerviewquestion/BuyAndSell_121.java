package com.practice.recrointerviewquestion;

/**
 * Author: Sandeep Singh
 * Date: 24/05/25
 */

public class BuyAndSell_121 {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int maxProfit = maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (buy > price) {
                buy = price;
            }
            int sell = price - buy;
            maxProfit = Math.max(maxProfit, sell);
        }
        return maxProfit;
    }

}
