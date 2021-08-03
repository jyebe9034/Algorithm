package com.backjoon.basic.string.stringLoop;

import java.util.Arrays;
import java.util.Scanner;

public class P2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        String[] result = new String[input];
        for (int i = 0; i < input; i++) {
            String str = sc.nextLine();
            String[] split = str.split(" ");
            int count = Integer.parseInt(split[0]);
            char[] chars = split[1].toCharArray();
            StringBuilder builder = new StringBuilder();
            for (char one : chars) {
                for (int j = 0; j < count; j++) {
                    builder.append(one);
                }
            }
            result[i] = builder.toString();
        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
