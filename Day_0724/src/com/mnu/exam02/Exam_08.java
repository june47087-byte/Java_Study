package com.mnu.exam02;

public class Exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, b = 2, c = 3, d = 4;
		int mx, mn; //  출력은 3 나옴 mx, mn 변수 이름에 속지 말고 계산식을 자세히 보자.
		mx = a < b ? b : a; // mx = b
		if(mx == 1) {
			mn = a > b ? b : a;
		}else {
			mn = b < mx ? d : c;
		}
		System.out.println(mn);
	}

}
