package chap01;

import java.util.Scanner;

public class Q9 {
	
	static int sumof(int a, int b) {
		int sum = 0;
		
		if(a >= b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		}else {
			for(int i = a; i <= b; i++) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a 입력 : ");
		int a = sc.nextInt();
		System.out.print("b 입력 : ");
		int b = sc.nextInt();
		
		System.out.println(sumof(a, b));
	}
}
