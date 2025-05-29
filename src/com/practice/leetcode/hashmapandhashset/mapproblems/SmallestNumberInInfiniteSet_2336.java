package com.practice.leetcode.hashmapandhashset.mapproblems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Author: Sandeep Singh
 * Date: 27/05/25
 */

public class SmallestNumberInInfiniteSet_2336 {

//    Way 1
   /* private final boolean[] nums;
    private int i;

    public SmallestNumberInInfiniteSet_2336() {
        nums = new boolean[1001];
        Arrays.fill(nums, true); // equivalent to C++ vector<bool>(1001, true)
        i = 1;
    }

    public int popSmallest() {
        int result = i;
        nums[i] = false;
        for (int j = i + 1; j < 1001; j++) {
            if (nums[j]) {
                i = j;
                break;
            }
        }
        return result;
    }

    public void addBack(int num) {
        if (!nums[num]) { // only add back if it was removed
            nums[num] = true;
            if (num < i) {
                i = num;
            }
        }
    }*/

//    Way-2
   TreeSet<Integer> treeSet;
    public SmallestNumberInInfiniteSet_2336() {
        treeSet =new TreeSet<>();
        for(int i=1; i<=1000; i++){
            treeSet.add(i);
        }
    }

    public int popSmallest() {
        return treeSet.pollFirst();
    }

    public void addBack(int num) {
        treeSet.add(num);
    }


    public static void main(String[] args) {
        String[] operations = {"SmallestInfiniteSet", "addBack", "popSmallest", "popSmallest",
                "popSmallest", "addBack", "popSmallest", "popSmallest", "popSmallest"};
        int[][] inputs = {{}, {2}, {}, {}, {}, {1}, {}, {}, {}};
        SmallestNumberInInfiniteSet_2336 set = null;

        for (int opIndex = 0; opIndex < operations.length; opIndex++) {
            String op = operations[opIndex];
            switch (op) {
                case "SmallestInfiniteSet":
                    set = new SmallestNumberInInfiniteSet_2336();
                    System.out.println("null");
                    break;
                case "addBack":
                    set.addBack(inputs[opIndex][0]);
                    System.out.println("null");
                    break;
                case "popSmallest":
                    System.out.println(set.popSmallest());
                    break;
            }
        }
    }

    // Way-3
  /*  int currentNum;
    Set<Integer> set;

    public SmallestNumberInInfiniteSet_2336() {
        currentNum = 1;
        set = new HashSet<>();
    }

    public int popSmallest() {
        if (!set.isEmpty()) {
            Integer min = Collections.min(set);
            set.remove(min);
            return min;
        } else {
            currentNum++;
            return currentNum - 1;
        }
    }

    public void addBack(int num) {
        if(currentNum>num){
            set.add(num);
        }
    }
*/
}


