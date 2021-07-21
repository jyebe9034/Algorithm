package com.backjoon.basic.max;

import java.util.Arrays;
import java.util.Scanner;

public class P2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] copy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numbers);
        int number = numbers[numbers.length-1];
        System.out.println(number);

        for (int i = 0; i < numbers.length; i++) {
            if (copy[i] == number) {
                System.out.println(i+1);
            }
        }
    }
}