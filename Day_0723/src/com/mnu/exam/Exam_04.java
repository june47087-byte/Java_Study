package com.mnu.exam;
class CC {
	int a = 10;
	void exam() {
		System.out.println("a = " + a);
	}
}
// fianl 변수를 상수화(객체생성 불가능이다) 클래스에 붙으면 상속 불가능이다. 메소드에 붙으면 오버라이딩 불가능
class ChCC extends CC {
	int b = 100;
	void test() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	// 오버라이딩 : 재정의 (메소드 이름 반환타입 매개변수 이런거 바꾸지 말고 내용물만 바꿀 수 있다.)
	void exam() {
		super.exam();
		System.out.println("b = " + b);
	}
	void exam(int a) {
		System.out.println("a = " + a);
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
