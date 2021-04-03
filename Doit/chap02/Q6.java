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
		int no, cd, dno; // no(정수), cd(기수), dno(변환 후 자릿수)
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			System.out.print("변환하는 음이 아닌 정수 : ");
			no = sc.nextInt();
		}while(no < 0);
		
		do {
			System.out.print("어떤 진수로 변환할까요? : ");
			cd = sc.nextInt();
		}while(cd < 2 || cd > 32);
		
		dno = cardConv(no, cd, cno);
		
		for(int i = 0; i < dno; i++) {
			System.out.print(cno[i]);
		}
		System.out.println("입니다.");
	}
}
