package chap02;

import java.util.Scanner;

public class Q6 {

	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		}while(x != 0);
		
		for(int i = 0; i < digits/2; i++) {
			char temp = d[i];
			d[i] = d[digits - i -1];
			d[digits - i -1] = temp;
		}
		
		return digits;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no, cd, dno; // no(����), cd(���), dno(��ȯ �� �ڸ���)
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
			no = sc.nextInt();
		}while(no < 0);
		
		do {
			System.out.print("� ������ ��ȯ�ұ��? : ");
			cd = sc.nextInt();
		}while(cd < 2 || cd > 32);
		
		dno = cardConv(no, cd, cno);
		
		for(int i = 0; i < dno; i++) {
			System.out.print(cno[i]);
		}
		System.out.println("�Դϴ�.");
	}
}
