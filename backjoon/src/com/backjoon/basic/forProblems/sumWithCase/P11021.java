package com.backjoon.basic.forProblems.sumWithCase;

import java.util.Scanner;

public class P11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        String[] inputs = new String[T];
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextLine();
        }
        for (int i = 0; i < inputs.length; i++) {
            String input = inputs[i];
            String[] arr = input.split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            System.out.println("Case #" + (i+1) + ": " + (A+B));
        }
    }
}
