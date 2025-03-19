package com.practice.interviewquestion.java17newfeatures.stringtextblock;

/**
 * Author: Sandeep Singh
 * Date: 19/03/25
 */

public class StringTextBlock {
    public static void main(String[] args) {
        String json = """
                {
                    "name": "John",
                    "age": 25
                }
                """;
        System.out.println(json);
    }
}
