class AA{
	// 속성
	int a; // 클래스에 속해 있는 변수를 멤버 변수(멤버 필드)라 한다
	int b;
	// 기능
	void add() {
		System.out.printf("%d + %d = %d\n", a, b, (a + b));
	}
	void sub(int a, int b) { // 지역 변수와 멤버변수의 차이를 알아보자. 멤버 변수는 ab가 이미 만들어져 있고 지역 변수는 그때 그떄 만든다고 한다.	
		System.out.printf("%d + %d = %d\n", a, b, (a + b));
	}
}


public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a1 = new AA();
		a1.a = 100;
		a1.b = 200;
		a1.add();
		a1.sub(10, 20); // 위의 것에서 처음은 그냥 통짜로 넣은거고 이거는 식을 불러온것
	}

}
