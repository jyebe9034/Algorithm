package com.backjoon.basic.countEachNumber;

import java.util.Objects;
import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= sc.nextInt();
        }
        char[] chars = Objects.toString(result).toCharArray();

        int[] arr = new int[10];
        for (char one : chars) {
            int value = Integer.parseInt(Objects.toString(one));
            for (int i = 0; i < arr.length; i++) {
                if (value == i) {
                    arr[i]++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
