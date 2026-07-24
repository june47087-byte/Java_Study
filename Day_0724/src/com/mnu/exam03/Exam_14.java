package com.mnu.exam03;

public class Exam_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j = 0;
		for(i = 0; i <= 5; i++) {
			j += i;
			System.out.print(i);
			if(i == 5) {
				System.out.print("=");
			}else {
				System.out.print("+");
			}
		}
		System.out.println(j);
	}

}
