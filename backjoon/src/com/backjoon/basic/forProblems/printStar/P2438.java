package com.backjoon.basic.forProblems.printStar;

import java.util.Scanner;

public class P2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String star = "";
        for (int i = 0; i < input; i++) {
            star += "*";
            System.out.println(star);
        }
    }
}
