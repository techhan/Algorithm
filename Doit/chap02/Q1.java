package chap02;
import java.util.Random;

public class Q1 {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) max = a[i];
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("Ű�� �ִ� ���ϱ�");
		System.out.print("��� �� : ");
		int n = rand.nextInt(11);
		System.out.println(n);
		int[] height = new int[n];
		
		System.out.println("Ű ���� �Ʒ��� ����");
		
		for(int i = 0; i < n; i++) {
			height[i]= 100 +  rand.nextInt(90); // ����� ���� ������ ���� 
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("�ִ��� " + maxOf(height)+ "�Դϴ�." );
	} 
}
