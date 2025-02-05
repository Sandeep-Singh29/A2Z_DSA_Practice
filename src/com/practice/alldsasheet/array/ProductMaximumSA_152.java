package com.practice.alldsasheet.array;

import java.util.Arrays;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public class ProductMaximumSA_152 {
    public static void main(String[] args) {
        int[] num = {2, 3, -2, 4};
//        int i = maxProduct(num);
//        System.out.println(i);
        int kad = maxProductUsingKadane(num);
        System.out.println(kad);

    }

    public static int maxProduct(int[] num) {
        int len = num.length;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            int prod = num[i];
            maxProduct = Math.max(maxProduct, prod);
            for (int j = i + 1; j < len; j++) {
                prod *= num[j];
                maxProduct = Math.max(maxProduct, prod);
            }
        }
        return maxProduct;
    }

    public static int maxProductUsingKadane(int[] num) {
        int len = num.length;
        int ans = num[0];
        int leftProduct = 1;
        int rightProduct = 1;
        for (int i = 0; i < len; i++) {
            // if any product is 0 then update to 1
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            // left sa right product kar raha hai
            leftProduct *= num[i];
            // right sa left product kar raha hai
            rightProduct *= num[len - 1 - i];
            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }

}
