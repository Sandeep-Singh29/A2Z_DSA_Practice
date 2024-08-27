package com.practice.leetcode.string;

public class RotateString_796 {

    public static boolean rotateString(String s, String goal) {
      /*  if(s.equals(goal)){
            return true;
        }
        for(int i=1;i<s.length();i++){
            String substring = s.substring(i);
            String substring1 = s.substring(0, i);
            String concat = substring+substring1;
            if (concat.equals(goal)){
                return true;
            }
        }
        return false;*/
        if (s.length() == goal.length() && (s + s).contains(goal)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abcde", goal = "abced";
        boolean b = rotateString(s, goal);
        System.out.println(b);
    }
}
