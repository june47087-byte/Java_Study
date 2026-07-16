//재귀(Recursion)함수 : 자기가 신을 호출
public class Exam_14 {
	static void test(int n) {
		if(n == 0) {
			return;
		}
		System.out.println("Hello World!");
		test(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(5);
	}

}
