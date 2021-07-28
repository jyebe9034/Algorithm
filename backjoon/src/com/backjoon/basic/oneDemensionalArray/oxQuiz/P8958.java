package com.backjoon.basic.oneDemensionalArray.oxQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class P8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int howMany = Integer.parseInt(sc.nextLine());
        int[] result = new int[howMany];
        int score = 0;
        int num = 1;
        for (int i = 0; i < howMany; i++) {
            String quiz = sc.nextLine();
            String[] split = quiz.split("");
            for (String one : split) {
                if (one.equals("O")) {
                    score = score + num;
                    num++;
                } else {
                    num = 1;
                }
            }
            result[i] = score;
            score = 0;
            num = 1;
        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
