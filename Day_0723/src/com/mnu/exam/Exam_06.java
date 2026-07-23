package com.mnu.exam;
class SuperA {
	
}
class ChildA extends SuperA { 

}
class ChildAA extends ChildA {
	
}
public class Exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조상은 자식 객체 생성 가능
		SuperA a = new SuperA();
		
		SuperA sa = new ChildA(); // 업 캐스팅(형변환)
		
		
		// 자식은 조상 객체 생성 불가
		// ChildA ca = new SuperA();
		int value = (int)3.14; // 형 변환(실수를 정수로)
		double dd = 100; //  자동 형변환
		// ChildA ca = (ChildA) a; // 이거 에러 안 뜨지만 run 해보면 에러 난다. compile만 성공한것(runtime error)
		int[] var = new int[3];
		//var[5] = 100;// 이것도 runtimeerror다.
		
		ChildA ca = (ChildA)sa; // SuperA sa = new ChildA(); // 업 캐스팅(형변환)
		// sa는 사실 자식 클래스니까 원상복구 시킨거임 
		SuperA b = new ChildAA();
		ChildA c = new ChildAA(); // 결론은 새로 만든 객체에 초기화 할때 자기보다 자식 클래스면 되는듯 자식 클래스면 자기 자신이 들어있으니까 
	}

}
