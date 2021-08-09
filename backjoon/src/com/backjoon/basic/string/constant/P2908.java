package com.backjoon.basic.string.constant;

import java.util.Scanner;

public class P2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArr = input.split(" ");

        StringBuffer first = new StringBuffer(inputArr[0]);
        String firstReverse = first.reverse().toString();
        StringBuffer second = new StringBuffer(inputArr[1]);
        String secondReverse = second.reverse().toString();

        int num1 = Integer.parseInt(firstReverse);
        int num2 = Integer.parseInt(secondReverse);
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
