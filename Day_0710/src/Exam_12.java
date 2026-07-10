/* 키보드로 이름 국어 영어 수학 입력 총점 평균 등급을 구햐여 출력
 * 등급은 100~90 수, 89~80 우, 79~70 미, 69~60 양, 59~0 가
 * [입력형식]
 * 입력 : 김형준 90 77 85
 * 
 * [출력형식]
 * 이름 : 김형준
 * 총점 : XX
 * 평균 : XX
 * 등급 : X
 * 
 * switch case()만 사용
 */

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		String nam = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		int sum = kor + eng + mat;
		double ave = (int)(sum/3.*100+0.5)/100.; // 반올림
		double ave1 = sum/3.; // 반올림 안 한 경우
//		위의 두개는 뭘까 그리고 String.format(("%.2f"), ave1) 이건 왜 넣지?
		String grade = " ";
		
		switch((int)ave/10) {
		case 10:
		case 9:
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		case 6:
			grade = "양";
			break;
		default:
			grade = "가";
		}
		System.out.print("이름 : " + nam + "\n" + 
						 "총점 : " + sum + "\n" + 
						 "평균 : " + ave + "\n" +
						 "평균 : " + String.format(("%.2f"), ave1) + "\n" + 
						 "등급 : " + grade);
		
		
	}

}
