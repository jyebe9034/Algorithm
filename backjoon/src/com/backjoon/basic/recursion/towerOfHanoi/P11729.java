package com.backjoon.basic.recursion.towerOfHanoi;

import java.io.*;

public class P11729 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        /* 원판이 움직이는 횟수를 구하는 공식..(2의 N제곱 -1) */
        bw.write((int) Math.pow(2, N) - 1 + "\n");

        hanoi(N, 1, 2, 3);

        bw.flush();
        bw.close();
    }

    /*
		N : 원판의 개수
		start : 출발지
		mid : 옮기기 위해 이동해야 장소
		to : 목적지
	 */
    public static void hanoi(int N, int start, int mid, int to) throws IOException {
        // 이동할 원반의 수가 1개라면?
        if (N == 1) {
            bw.write(start + " " + to + "\n");
            return;
        }

        // STEP 1 : N-1개를 A에서 B로 이동
        hanoi(N-1, start, to, mid);

        // STEP 2 : 1개를 A에서 C로 이동
        bw.write(start + " " + to + "\n");

        // STEP 3 : N-1개를 B에서 C로 이동
        hanoi(N - 1, mid, start, to);
    }

}
