//키보드로 N(값) 입력 1 ~ N 까지 정수를 출력 후 홀수의 합을 출력. 한줄에는 10개씩 출력

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("값 입력 : ");
		int n = scn.nextInt();
		
		
//		예제
//		int sum = 0;
//		for(int i = 1; i <= n; i++) {
//			System.out.printf("%4d", i);
//			if(n%10 == 0) {
//				System.out.print("\n");
//			}
//			if(i%2 == 1) {
//				sum += i; 
//			}
//			System.out.print("홀수 합: " + sum);
//		}
		
		
		
//		내가 만든 것
		int sum = 0;
		int num = 1;
		for(int i = 0; i <= n/10; i++) {		
			for(int k =  1; k <= 10; k++) {
				if(n < num) { 
					break; 
				}
				System.out.printf("%5d", num); 
				if(num % 2 != 0) {
					sum += num; 
				}
				num++;
			}
			System.out.print("\n");
		}
		System.out.print("홀수 합 : " + sum);
	}

}
