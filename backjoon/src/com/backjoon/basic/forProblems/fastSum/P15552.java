package com.backjoon.basic.forProblems.fastSum;

import java.io.*;

public class P15552 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(br.readLine());
            String[] inputs = new String[T];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = br.readLine();
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < inputs.length; i++) {
                String input = inputs[i];
                String[] arr = input.split(" ");
                int A = Integer.parseInt(arr[0]);
                int B = Integer.parseInt(arr[1]);
                bw.write((A + B) + "\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
