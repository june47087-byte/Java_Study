class Point{
	// 멤버변수, 인스턴스 변수의 분기를 가르는건 언제 초기화 되냐이다.   
	int a;
	int b;
	int c =5; // 명시적 초기화 
	static int d; // 정적(클래스)변수. 메소드 영역에 생성된다. 클래스 변수는 p1와 p2가 공유한다.
}
public class Exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(); // 디폴트 값으로 초기화된다. 그런데 명시적 초괴화 된 변수는 그 값으로 초기화 된다.   
		Point p2 = new Point(); // 정적 변수는 공유한다.   
		
	}

}
