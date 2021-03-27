package chap01;

import java.util.Scanner;

public class Q15 {
	static void triangleLB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = n; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n -1; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¸î ´Ü »ï°¢Çü? : ");
		int n = sc.nextInt();
		
		triangleLB(n);
		System.out.println("-------------------------");
		triangleLU(n);
		System.out.println("-------------------------");
		triangleRU(n);
		System.out.println("-------------------------");
		triangleRB(n);
	}
}
