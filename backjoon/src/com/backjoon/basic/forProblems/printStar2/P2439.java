package com.backjoon.basic.forProblems.printStar2;

import java.util.Scanner;

public class P2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String star = "";
        for (int i = 0; i < input; i++) {
            for (int j = 1; j < input - i; j++) {
                System.out.print(" ");
            }
            star += "*";
            System.out.println(star);
        }
    }
}
