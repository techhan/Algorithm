package chap01;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a�� �� : ");
		int a = sc.nextInt();
		int b;
		do {
			System.out.print("b�� �� : ");
			b = sc.nextInt();
			if(a >= b) System.out.println("a���� ū ���� �Է��ϼ���.");
		}while(a >= b);
		
		System.out.println("b-a�� " + (b-a) + "�Դϴ�.");
	}

}
