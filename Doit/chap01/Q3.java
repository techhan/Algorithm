package chap01;
import java.util.Scanner;

public class Q3 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d = 0;
		
		System.out.println("�� ���� �Է�");
		System.out.print("a�� �� : ");
		a = sc.nextInt();
		System.out.print("b�� �� : ");
		b = sc.nextInt();
		System.out.print("c�� �� : ");
		c = sc.nextInt();
		System.out.print("d�� �� : ");
		d = sc.nextInt();

		
		System.out.print("�ּڰ� : " + min4(a,b,c,d));
	}
}
