package chap02;

import java.util.Scanner;

public class Q9 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// ����
		};
	
	static int isLeap(int y) {
		return (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)? 1 : 0;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		int days = 0;
		
		for(int i = m; i <= 12; i++) {
			days += mdays[isLeap(y)][i-1];
		}
		return days - d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �� ���� ����");
		
		do {
			System.out.print("�� : "); int year = sc.nextInt();
			System.out.print("�� : "); int month = sc.nextInt();
			System.out.print("�� : "); int day = sc.nextInt();
			
			System.out.printf("�� �ش� %d�� ���ҽ��ϴ�.\n", leftDayOfYear(year, month, day));
			
			System.out.print("�� �� �� �ұ��? (1. �� / 0. �ƴϿ�) : ");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}