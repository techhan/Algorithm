package chap02;

import java.util.Scanner;

public class Q2 {
	
	static void swap(int[]x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;
	}
	
	static void reverse(int[] x) {
		for(int i = 0; i < x.length / 2; i++) {
			for(int j = 0; j < x.length; j++) {
				System.out.print(x[j] + " ");
			}
			System.out.println("\nx[" + i + "]과(와) x[" + (x.length - i -1) + "]를 교환합니다.");
			swap(x, i, x.length - i - 1);
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num;  i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("역순 정렬 마쳤습니다.");
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
	}

}
