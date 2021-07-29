package com.backjoon.basic.oneDemensionalArray.moreThanAverage;

import java.util.Arrays;
import java.util.Scanner;

public class P4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCount = Integer.parseInt(sc.nextLine());
        String[] result = new String[totalCount];
        for (int i = 0; i < totalCount; i++) {
            String group = sc.nextLine();
            String[] split = group.split(" ");
            int count = Integer.parseInt(split[0]);
            int[] scores = new int[count];
            int sum = 0;
            for (int j = 0; j < scores.length; j++) {
                scores[j] = Integer.parseInt(split[j+1]);
                sum += scores[j];
            }
            int avg = sum / count;
            double moreTanAvg = 0.0;
            for (int score : scores) {
                if (score > avg) {
                    moreTanAvg++;
                }
            }
            double rate = moreTanAvg / count * 100;
            String floatRate = String.format("%,.3f", rate);
            result[i] = floatRate + "%";
        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
