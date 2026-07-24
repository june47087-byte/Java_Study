package com.mnu.exam03;

public class Exam_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10진수를 입력해서 2진수로 변환하는 프로그램의 일부분이다. [ ]를 채워 완성하라.
		int val = 25;
		int mok, nmg;
		String bin = "";
		while(val != 0) {
//			mok = val / 2;
			nmg = val % 2; // [ 1 ]
			bin = nmg + bin;
//			val = mok; // [ 2 ]
			val /= 2;
		}
		System.out.print("2진수 : " + bin);
	
	
	
	}

}
