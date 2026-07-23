package com.mnu.exam;
class BB {
	int a;
	BB(int a){
		this.a = a;
	}
}

class ChBB extends BB {
	// bb의 디폴트 생성자가 없으면 상속이 안된다. 디폴트 생성자가 없으면 객체가 안만들어지고 그러면 상속 불가능이다.
	ChBB() {
		super(10);
	}
	// 생성자의 연속 호출
}
public class Exam_03 {

	public static void main(String[] args) {
		ChBB cb = new ChBB();
		

	}

}
