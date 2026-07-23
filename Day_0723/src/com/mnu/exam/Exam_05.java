package com.mnu.exam;
class DD { // 조상 클래스는 상속 클래스에게 상속한 내용(변수, 메소드등)은 통제 가능
	int a = 10;
	void exam() {
		System.out.println("a = " + a);
	}
}
class ChDD extends DD {
	int b =20;
	// 오버라이딩
	void exam() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	void test() {
		super.exam();
		System.out.println("b = " + b);
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DD c2 = new ChDD();
		System.out.println("a = " + c2.a);
		// System.out.print("b = " + c2.b); ChDD에서 새로 만든거라 불가능 자식에서 생성된거라 조상 클래스가 통제 불가
		
		c2.exam(); // 어떤 exam이 호출되나? 오버라이딩된 메소드가 호출된다.
	}

}
