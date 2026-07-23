package com.mnu.exam;
// 계산기 클래스
public class calculate2 {
	private int a; // 멤버변수(인스턴스 변수) 
	private int b; //
	int c;
	protected int d;
	// 생성자(클래스 이름과 동일한 메소드여야 한다. 그래서 반환 타입이 없다. 객체 생성이 존재 이유다. 객체 생성을 안하면 그 위의 다른 메소드들이 안 돌아감)
	public calculate2() {} // 객체 생성하면서 초기화해라 
	public calculate2(int a) {
		this.a = a; // this.a는 멤버변수 a는 멤버변수 
		// b = a;도 가능하다.
	} // 매개변수 
	public calculate2(int a, int b) { //초기화 하려고 int a int b 넣은것
		this.a = a; // this.a를 a로 초기화 한것
		this.b = b;
	}
	// 생성자 오버로딩 
	// 여기까지는 다 객체 생성용이다 뭐 그런거 만약 메인ㅇ에서 하면 아마도 calculate c1 = new calculate(); calculate(1, 2); 이런거일듯
	// 그리고 아래 기능 메소드를 c1.add(); 이렇게 호출 하겠지
	
	//기능 메소드
	public void add() {
		int result = a + b;
		System.out.printf("%d + %d = %d\n", a ,b, result);
	}
	public static void add(int a, int b) { // 메소드 오버로딩 static(class method, 정적 메소드)
		int result = a + b;
		System.out.printf("%d + %d = %d\n", a ,b, result);
	}

}
