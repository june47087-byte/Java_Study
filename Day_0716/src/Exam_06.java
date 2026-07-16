class AA {
	void aaa() {
		
	}
}


public class Exam_06 {
//메소드는 이렇게 만들어야한다. class 안에 메소드를 만들어야한다. 메소드 안에 메소드는 불가능하다 따로 만들어야 한다.	
	static void aaa() {
		// 붙히는 이유는 메인과 동등하다라고 표시하는것. 실전에서는 만들일이 없다.
	}
	
	// 1. 반환타입 X, 매개변수 X
	static void method_1() {
		
	}
	// 2. 반환타입 X, 매개변수 O
	static void method_2(int a, int b) {
		
	}
	// 3. 반환타입 O, 매개변수 X
	static int method_3() {
		
		return 1; // return 정수값 또는 변수
	}
	// 4. 반환타입 O, 매개변수 O
	static int method_4(int[] a) {
		
		return 1; // return 정수값 또는 변수
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 메소드 호출
		method_1();
		
		//2.
		method_2(100, 2);
		
		//3.
		int s = method_3();
		
		//4.
		int ss[] = {1, 2, 3, 4};
		int k = method_4(ss); 
	}
//
}
