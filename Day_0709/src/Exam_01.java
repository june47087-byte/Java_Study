/*class 독자적으로 마우스 만들겠다 class는 메인이 들어가지 않는다.
 * java 기본 타임 8종류 
 * 논리 : boolean(1) True/False
 * 정수 : byte(1) short(2) char(2) int(4) long(8) 
 * 실수 : float(4) double(8)
 * 정수의 기본은 int 실수의 기본은 double 사실상 이것 2개면 해결 된다.
 * 
 * 형 변환(자동, 강제)
 * 참조 타입 : 클래스(첫 글자가 대문자다. ex: String), 배열, 인터페이스 
 */

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = true; // true//falst
		byte by = 120; //-128 ~ 127 
		// byte by2 = 130;
		short sh = 12345; // -32000 ~ 32000
			// short sh2 = 'a';
		char ch1 = 65; // 음수 저장불가 // 0 ~ 65000 // 정수를 문자로 바꿔라 일종의 자동 형변환
		char CH2 = 'A'; // 문자도 저장 가능

		int in = 70000; // -20억 ~ 20억
		int in2 = 'a'; //자동 형변환 문자를 정수로
		int in3 = 65; 
		
//		float fl1 = 3.14; //실수의 기본은 double 그래서 이 코드는error 발생한다
		float fl2 = 3.14f;
		float fl3 = (float)3.14; // 강제 형변환
		
		double do1 = 3.14;
		
		System.out.println("bool = " + bool);
		System.out.println("by = " + by);
		System.out.println("ch1 = " + ch1);
		System.out.println("CH2 = " + CH2);
		System.out.println("in = " + in);
		System.out.println("in2 = " + in2);
		System.out.println("in3 = " + in3);
		System.out.println("fl2 = " + fl2);
		System.out.println("fl3 = " + fl3);
		System.out.println("do1 = " + do1);
		
	}

}
