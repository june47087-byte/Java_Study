/* 키보드 입력 Scanner 클래스 도움으로 입력
 * 정수, 실수, 문자열 구분하여 입력 가능
 * 
 */

import java.util.Scanner;
public class Exam_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scn은 스캐너 타입이다. 그러니 스캐너만 저장가능 
		// 단순히 스캐너 스트링만 한줄에 두면 왜 스캐너는 에러 나는데 스트링은 에러가 안나나? 자주 사용하는 클래스는 자바가 미리 끌어온게 있기에(인포트) 에러가 안나는거다 미리 sum=0 해둔것 같은거다. 
		// 객체 생성(클래스를 이용하여 객체 생성)
		Scanner scn; // 변수 선언
		scn = new Scanner(System.in); // 객체 생성
		
		Scanner scn2 = new Scanner(System.in);
		System.out.println("이름 국어 영어 수학 입력하시오"); // 입력할때 각 입력각들 사이에 띄어쓰기 한칸이나 엔터로 간격을 둬야 한다
		String name = scn.next(); // 문자열		
		int k = scn.nextInt(); // 정수
		int e = scn.nextInt(); // 정수
		int m = scn.nextInt(); // 정수
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + k);
		System.out.println("영어 : " + e);
		System.out.println("수학 : " + m);
		System.out.println("총점 : " + (k + e + m));
		System.out.println("평균 : " + (k+e+m)/3);
		
		
		
	}
	

}
