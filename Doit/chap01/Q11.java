package chap01;
import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i <= n; i*=10) {
			cnt++;
		}
		System.out.println("�� ���� " + cnt + "�ڸ��Դϴ�.");
	}
}
