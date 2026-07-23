package com.mnu.exam;
class Super {
	private int a = 10;
	int b = 100;
}

class Child extends Super {
	// 안 보이지만 b = 100;이 있는거다.
	int d = 10;	
	int b = 50;
	void test() { // 조상클래스,메소드.변수 하면 덮어씌원진 상속 변수 가져온다. 근데 이것도 2개 있음 this. 이랑 this(); 있는것처럼 super();는 조상 클래스 생성자 호출
		System.out.println("Super.b = " + super.b); // 상속 후 동일 변수 선언시 덮어씌워진다. 상속 변수는 삭제되는게 아니라 숨는다. 
		System.out.println("d = " + d);
		System.out.println("d = " + d);
	}
}

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s1 = new Super();
		System.out.println("s1.b = " + s1.b);
		Child c1 = new Child();
		System.out.println("c1.b = " + c1.b);
		System.out.println("c1.d = " + c1.d);
		System.out.println("-------------------");
		c1.test(); // 
	}

}
