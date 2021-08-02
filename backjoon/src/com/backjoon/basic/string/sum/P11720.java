package com.backjoon.basic.string.sum;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        sc.nextLine();
        String numberStr = sc.nextLine();
        String[] split = numberStr.split("");
        for (String one : split) {
            sum += Integer.parseInt(one);
        }
        System.out.println(sum);
    }
}
