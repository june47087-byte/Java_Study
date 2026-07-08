/* System.out.print();  줄바꿈 없이 출력, " " 하고 내용물이 있어야 한다.
 * System.out.print(\n); 도 println과 동일하다
 * System.out.println(); 줄바꿈 출력, 내용물이 없어도 된다
 * System.out.printf();  형식화 출력, f는 format(형식)의 약어 "  " 무조건 내용물이 있어야한다.
 * 숫자: 0~9,+,-,(뭔지모를기호) 5가지만 숫자취급이다 예시  3,000은 , 때문에숫자가 아니다
 * 문자' ' -> 1문자
 * 문자열 " " -> 여러문자
 * 논리 : True/False
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 을 만들어보자
 */
public class Exam_02 {

	public static void main(String[] args) {
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		System.out.println("------------");
//		이게 제일 간단하다. 그러나 ()안에 * 하나만 써야한다면? 아래와 같은 형태가 된다. 
//		print와 println의 차이점을 익히기 위함이다.
		System.out.print("*");
		System.out.print("\n"); // System.out.println(); 도 동일한 효과를 낸다.
		System.out.print("*");
		System.out.print("*");
		System.out.print("\n");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("\n");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("\n");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("\n");
	}

}
