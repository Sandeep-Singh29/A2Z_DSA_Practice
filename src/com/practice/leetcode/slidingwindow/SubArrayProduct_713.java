package com.practice.leetcode.slidingwindow;

/**
 * Author: SANDEEP
 * Date: 19/10/24
 */

public class SubArrayProduct_713 {

    private static int numSubarrayProductLessThanK(int[] numS, int productTarget) {
        int i=0;
        int j=0;
        int product=1;
        int count =0;
        int len = numS.length;
        while(len>j ){
            product*=numS[j];
            if(product<productTarget){
                count++;
            }else{
                j=i;
                i++;
                product=1;
            }
            j++;
            if(j==len){
                i++;
                j=i;
                product=1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int numS[] = {1,2,3};
        int k = 0;
        int productLessThanK = numSubarrayProductLessThanK(numS, k);
        System.out.println(productLessThanK);
    }

}
