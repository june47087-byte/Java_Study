//사칙연산 수행
//case에 break;가 없다면 다음 case로 가버린다. 아래 예시로는 7 + 4 여도 case + 아래 case - 로 계산해서 7+ 4 = 3으로 출력

import java.util.Scanner;
public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner scn = new scanner(System.in);
		Scanner scn = new Scanner(System.in);
		System.out.print("계산기: ");
		int a = scn.nextInt(); // 정수
		String op = scn.next(); // 연산자
		int b = scn.nextInt(); // 정수
		
		int result = 0;
		switch(op) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "%":
				result = a % b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
				break;
			default:
				System.out.print("연산자 오류");
//				System.exit(0); op 오류시 아래 프린트 나오는것의 해결은 되지만 이러면 좋은 방법은 아니다.
		}
		
		if(op.equals("+") || op.equals("-") || op.equals("%") || op.equals("*") ||  op.equals("/"));{
			System.out.println(a+ op + b + "=" + result);
		}
		
	}

}
