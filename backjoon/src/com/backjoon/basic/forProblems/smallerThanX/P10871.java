package com.backjoon.basic.forProblems.smallerThanX;

import java.util.Scanner;

public class P10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        int X = Integer.parseInt(arr[1]);
        String input2 = sc.nextLine();
        String[] numbers = input2.split(" ");
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
            if (num < X) {
                result += (num + " ");
            }
        }
        int length = result.length();
        System.out.println(result.substring(0, length-1));
    }
}
