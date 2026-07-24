package com.mnu.exam03;

public class Exam_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, sum = 0;
		while(a < 10) {
			a++;
			if(a % 2 == 1) {
				continue; // while로 돌아가라
			}
			sum += a;	// 결론 짝수의 합
		}
		System.out.println(sum);
	}

}
