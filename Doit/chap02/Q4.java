package chap02;

import java.util.Scanner;

public class Q4 {
	static void copy(int[] a, int[] b) {
		int num = a.length;
		if(a.length >= b.length) {
			num = b.length;
		}
		
		for(int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열 a의 요솟수 : ");
		int numA = sc.nextInt();
		int[] a = new int[numA];
		
		for(int i = 0; i < numA; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int numB = sc.nextInt();
		int[] b = new int[numB];
		
		for(int i = 0; i < numB; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		copy(a, b);
		System.out.println("복사 완료");
		for(int i = 0; i < numA; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
