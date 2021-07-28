package com.backjoon.basic.oneDemensionalArray.average;

import java.util.Arrays;
import java.util.Scanner;

/**
 * TODO NumberFormatException이 왜나지...?
 */
public class P1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        double[] numbers = new double[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(sc.nextLine());
        }
        double max = Arrays.stream(numbers).max().getAsDouble();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] / max * 100;
        }
        double newAverage = Arrays.stream(numbers).average().getAsDouble();
        System.out.println(newAverage);
    }
}

