package bbb;

import aaa.Test;

public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test(); // 클래스는 자체는 퍼블릭이다.
//		t1.a = 1000; 이 세가지는 같은 패키지 안에 있어야 작동한
//		t1.b = 2000; 클래스와 안의 변수는 별개다. 
//		t1.c = 3000; 이 세가지가 정석이다.
		t1.d = 4000; // 이건 정석이 아님 외부에서 접근이 가능해서 어떻게 꼬일지 모르니까
	
	}

}
