package chap01;
import java.util.Scanner;

public class Q2 {
	
	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0;
		
		System.out.println("�� ���� �Է�");
		System.out.print("a�� �� : ");
		a = sc.nextInt();
		System.out.print("b�� �� : ");
		b = sc.nextInt();
		System.out.print("c�� �� : ");
		c = sc.nextInt();

		
		System.out.print("�ּڰ� : " + min3(a,b,c));
	}
}
