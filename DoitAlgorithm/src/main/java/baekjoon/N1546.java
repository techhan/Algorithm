package baekjoon;

import java.util.Scanner;

public class N1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        for(int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;
        for (int n : score) {
            if(max < n) {
                max = n;
            }
            sum += n;
        }

        double avg = (sum * 100) / max / N;
        System.out.println(avg);
    }
}
