package chap01;
import java.util.Scanner;

public class Q1 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max; 
	}
	
	public static void main(String[] args) {
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
		
		System.out.print("�ִ� : " + max4(a,b,c,d));
	}
}
