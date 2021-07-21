package com.backjoon.basic.minAndMax;

import java.util.Scanner;

public class P10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int min = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(arr[i]);
            if (i == 0) {
                min = num;
                max = num;
            }
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println(min + " " + max);
    }
}
