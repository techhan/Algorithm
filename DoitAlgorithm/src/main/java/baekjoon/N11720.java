package baekjoon;

import java.util.Scanner;

public class N11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = "";
        do {
            str = sc.next();
        } while (str.length() != N);

        char[] charArr = str.toCharArray();

        int sum = 0;
        for (char c : charArr) {
            sum += c - '0';
        }

        System.out.println(sum);
    }
}
