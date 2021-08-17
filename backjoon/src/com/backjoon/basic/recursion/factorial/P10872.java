package com.backjoon.basic.recursion.factorial;

import java.util.Scanner;

public class P10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        int result = factorial(input);
        System.out.println(result);
    }

    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
}
