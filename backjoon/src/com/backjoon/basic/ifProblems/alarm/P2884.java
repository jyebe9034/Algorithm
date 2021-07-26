package com.backjoon.basic.ifProblems.alarm;

import java.util.Scanner;

public class P2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int H = Integer.parseInt(arr[0]); // hour
        int M = Integer.parseInt(arr[1]); // minute
        if (M >= 45) {
            System.out.println(H + " " + (M-45));
        } else {
            int m = M - 45;
            int minute = 60 + m;
            int hour = H;
            if (hour > 0) {
                hour = hour - 1;
            } else {
                hour = 23;
            }
            System.out.println(hour + " " + minute);
        }
    }
}