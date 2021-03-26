package chap01;

import java.util.Scanner;

public class Q8 {
	
	static int sum(int n) {
		float sum = 0;
		sum = (1 + n) * ((float)n / 2);
		return (int)sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n °ª ÀÔ·Â : ");
		int n = sc.nextInt();
		
		System.out.println(sum(n));
	}

}
