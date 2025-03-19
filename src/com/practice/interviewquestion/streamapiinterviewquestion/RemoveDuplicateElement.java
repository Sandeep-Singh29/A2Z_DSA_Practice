package com.practice.interviewquestion.streamapiinterviewquestion;

import java.util.Arrays;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 11/03/25
 */

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6};

        List<Integer> distinctList = Arrays.stream(arr).boxed().distinct().toList();
        System.out.println(distinctList);

    }
}
