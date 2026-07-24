package com.mnu.exam02;

public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3, k = 1;
		switch(i) {
		case 1 : k++;
		case 2 : k += 3;
		case 3 : k = 0;
		case 4 : k += 3;
		case 5 : k -= 10;
		default : k--;
		}
		System.out.println(k);
		}
	}


