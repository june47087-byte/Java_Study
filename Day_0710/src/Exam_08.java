//3개의 정수를 입력 최대값, 최소값 찾기

import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		/*
		System.out.print("3개의 정수를 입력: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
	
//		3개의 정수중에서 하나라도 1 미만이 입련되면 오류 처리하시오
		if(a < 1 || b < 1 || c < 1) {
			System.out.print("입력오류");
			System.exit(0);
		}
		
		System.out.println(a + "," + b + "," +c);
		
		if(a < b) {
			int imsi = a; // a와 b의 값을 바꾸는 방식이다. 
			a = b;
			b = imsi;
		}
		if(a < c) {
			int imsi = a; // a와 b의 값을 바꾸는 방식이다. 
			a = c;
			c = imsi;
		}
		if(b < c) {
			int imsi = b;
			b = c;
			c = imsi;
		}
		
		System.out.print(a + ">" + b + ">" + c);
		*/
		
//		4개의 경우의 수를 생각해보자
		System.out.print("4개의 정수를 입력: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		
		System.out.println(a + "," + b + "," + c + "," + d);
		
		if(a < b) {
			int imsi = a; // a와 b의 값을 바꾸는 방식이다. 
			a = b;
			b = imsi;
		}
		if(a < c) {
			int imsi = a;
			a = c;
			c = imsi;
		}
		if(a < d) {
			int imsi = a; 
			a = d;
			d = imsi;
		}
		if(b < c) {
			int imsi = b;
			b = c;
			c = imsi;
		}
		if(b < d) {
			int imsi = b; 
			b = d;
			d = imsi;
		}
		if(c < d) {
			int imsi = c; 
			c = d;
			d = imsi;
		}
		System.out.print(a + ">" + b + ">" + c + ">" + d);
		
		
	}

}