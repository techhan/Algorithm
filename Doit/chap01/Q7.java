package chap01;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n ют╥б : ");
		int n = sc.nextInt();
		String str = "";
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i == n) {
				str += i + " = ";
			}else {
				str += i + " + ";
			}
			sum += i;
		}
		System.out.println(str + sum);
	}

}
