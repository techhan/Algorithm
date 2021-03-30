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
		
		System.out.println("키의 최댓값 구하기");
		System.out.print("사람 수 : ");
		int n = rand.nextInt(11);
		System.out.println(n);
		int[] height = new int[n];
		
		System.out.println("키 값은 아래와 같음");
		
		for(int i = 0; i < n; i++) {
			height[i]= 100 +  rand.nextInt(90); // 요소의 값을 난수로 결정 
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height)+ "입니다." );
	} 
}
