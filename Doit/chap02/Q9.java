package chap02;

import java.util.Scanner;

public class Q9 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	// 윤년
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
		
		System.out.println("그 해 경과 일 수를 구함");
		
		do {
			System.out.print("년 : "); int year = sc.nextInt();
			System.out.print("월 : "); int month = sc.nextInt();
			System.out.print("일 : "); int day = sc.nextInt();
			
			System.out.printf("그 해는 %d일 남았습니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? (1. 예 / 0. 아니오) : ");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
