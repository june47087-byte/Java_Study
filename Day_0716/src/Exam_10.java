//가변인자 :  매개변수가 경우에 따라 다를수 있다. 이럴 때 사용한다.
public class Exam_10 {
	// 아래와 같은걸 메소드 오버로딩이라 부른다. 하나의 클래스에 이름이 동일한 여러개의 메소드가 있을 수 있다.
	// 규칙 1. 메소드 이름은 동일해야 한다.  2. 매개변수 개수, 타입, 순서가 최소 셋 중 하나는 달라야한다.
	static void add(int a, int b) {
		
	}
	static void add(int a, int b, int c) {
	
	}
	static void add(int a, int b, int c, int d) {
	
	}
	static void add(double a, int b) {
		
	}
	static void add(int a, double b) {
		
	}
	
	// 가변인자 // 가변인자는 마지막에 뒤에 하나만 가능하다
	static void sum(int ... a) { // 배열처럼 작동한다.
		int s = 0;
		for(int i = 0; i < a.length; i++) {
			s += a[i];
		}
		System.out.println("s = " + s);
	}
	static void sum(String ss, int ... a) {
		
	}
	

	public static void main(String[] args) {
		sum(1, 2 ,3);
		sum(1, 2, 3);
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		sum(a);
	}

}
