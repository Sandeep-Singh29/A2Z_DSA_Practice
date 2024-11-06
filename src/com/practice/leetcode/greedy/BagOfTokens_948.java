package com.practice.leetcode.greedy;

import java.util.Arrays;

/**
 * Author: SANDEEP
 * Date: 31/10/24
 */

public class BagOfTokens_948 {

    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i = 0;
        int j = tokens.length - 1;
        int score = 0;
        while (i <= j) {
            if (power >= tokens[i]) {
                score += 1;
                power -= tokens[i];
                i++;
            } else if (score > 0 && tokens[i] <= (power + tokens[j]) && i != j) {
                power += tokens[j];
                score -= 1;
                j--;
            } else {
                break;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        int[] tokens = {200, 100};
        int power = 150;
        int tokensScore = bagOfTokensScore(tokens, power);
        System.out.println(tokensScore);
    }

}
