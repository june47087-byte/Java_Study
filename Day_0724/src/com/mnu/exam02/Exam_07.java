package com.mnu.exam02;
// 제어문
public class Exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 75, j = 9, k;
		if(i > j) 
			k = i - j;
		else 
			k = i + j;
		
		k = (i > j) ? i - j : i + j; // 이게 더 간단하다. 연산자가 제어문보다 속도가 빠르기도 하다.
		System.out.println(k);
		
	}

}
