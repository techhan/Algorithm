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
		
		System.out.println("세 정수 입력");
		System.out.print("a의 값 : ");
		a = sc.nextInt();
		System.out.print("b의 값 : ");
		b = sc.nextInt();
		System.out.print("c의 값 : ");
		c = sc.nextInt();

		
		System.out.print("최솟값 : " + min3(a,b,c));
	}
}
