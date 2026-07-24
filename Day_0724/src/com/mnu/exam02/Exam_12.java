package com.mnu.exam02;

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// Exception은 예외처리라는 의미다.
		System.out.print("1문자 입력 : ");
		//System.in.read(); 1문자를 입력 받아서 정수로 변환
		char ch = (char)System.in.read();
		switch(ch) {
		case 'a' : 
			System.out.print("one");
		case 'b' : 
			System.out.print("two");
		case 'c' : 
			System.out.print("three");
			break;
		case 'd' : 
			System.out.print("four");
			break;
		}
		
	}

}
