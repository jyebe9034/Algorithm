package com.backjoon.basic.ifProblems.compareTwoNum;

import java.util.Scanner;

public class P1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        if (A > B) System.out.println(">");
        else if (A < B) System.out.println("<");
        else System.out.println("==");
    }
}
