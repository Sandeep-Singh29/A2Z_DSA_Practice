package com.practice.leetcode.recursion;


public class KthSmallestLexicographicalOrder_440 {

    private static int countNumbers(long curr, long next, int n) {
        int countNum = 0;
        while (curr <= n) {
            countNum += (int) (Math.min(next, (long) n + 1) - curr);
            curr *= 10;
            next *= 10;
        }
        return countNum;
    }


    private static int findKthNumber(int n, int k) {
        int curr = 1;
        k -= 1; // Since we start from the first number (1), we need k-1 more numbers

        while (k > 0) {
            int count = countNumbers(curr, curr + 1, n);
            if (count <= k) {
                curr++;
                k -= count; // Skipping the elements under the current prefix tree
            } else {
                curr *= 10;
                k -= 1;
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        int n = 13, k = 2;
        int kthNumber = findKthNumber(n, k);
        System.out.println(kthNumber);
    }
}
