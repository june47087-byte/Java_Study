// 키보드로 정수 연산자 정수 입력 산술연산(+, -, *, /, %)을 수행하는 프로그램 작성

import java.util.Scanner;

public class Exam_06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자열 비교는 [문자열 == "문자열" ? 문자열은 상수가 아니기에 불가능, 문자열.equals("문자열")]
		// 입력 ; 7 * 7
		// 7 * 7 = 49
		// System.out.printf("%d * %d = %d \n", 7,7,(7*7));
		Scanner scn = new Scanner(System.in);
		System.out.println("입력 : ");
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();
		
		int sum = 0;
		
		if(op.equals("+")) {
			sum = a + b;
		}else if(op.equals("-")){
			sum = a - b;
		}else if(op.equals("*")) {
			sum = a * b;
		}else if(op.equals("/")) {
			sum = a / b;
		}else if(op.equals("%")) {
			sum = a % b;
		}else {
			System.out.println("연산자 오류");
			System.exit(1); // 종료
		}
		System.out.printf("%d %s %d = %d \n", a,op,b,sum);
		
	}

}
