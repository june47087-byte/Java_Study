package com.mnu.exam;
class EE {
	
}
class ChEE extends EE {
	
}
public class Exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EE e = new ChEE();
		// 객체 타입 확인 instanceof 연산자 사용법 : 변수명 instancof 클래스 이름
		if(e instanceof ChEE) { // 같은 클래스인지 물어보는것
			System.out.println("같은 타입임");
			ChEE ch = (ChEE)e;
		}else {
			System.out.println("타입이 다름");
		}
		
		if(e instanceof EE) { // 같은 클래스인지 물어보는것
			System.out.println("같은 타입임");
			ChEE ch = (ChEE)e;
		}else {
			System.out.println("타입이 다름");
		}
	}

}
