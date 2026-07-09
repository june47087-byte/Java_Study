		/*int a = 10, b = 20, c = 30;
		int a1 = 10;
		int b1 = 20;
		int c1 = 30;
		
		
		// 이해하기 쉽게 보자면 아래는 if(a >= 70){int b = 30;}else{int b = 30;}와 동일하다. 
		if(a>=70) {
			int c = 30;
		}else{
			int b = 30;
		}
			if(a>=70) {
			int b = 30;
			int C = 30;
		}else{
			int b = 30;
		}
		*/
		
	// 키보드로 입력된 정수가 80이상이면 "합격" 출력

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = scn.nextInt();
		
		if(num >= 80) {
			System.out.print("합격");			
		}else{
			System.out.print("프로그램 종료");
		}

	
	}

}
