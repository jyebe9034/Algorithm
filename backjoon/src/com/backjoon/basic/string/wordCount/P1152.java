package com.backjoon.basic.string.wordCount;

import java.util.Scanner;

public class P1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        int count = 0;
        for (String word : words) {
            if (!"".equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
