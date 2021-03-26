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
		
		System.out.println("네 정수 입력");
		System.out.print("a의 값 : ");
		a = sc.nextInt();
		System.out.print("b의 값 : ");
		b = sc.nextInt();
		System.out.print("c의 값 : ");
		c = sc.nextInt();
		System.out.print("d의 값 : ");
		d = sc.nextInt();
		
		System.out.print("최댓값 : " + max4(a,b,c,d));
	}
}
