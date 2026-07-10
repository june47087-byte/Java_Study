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
 * if()만 사용
 */

import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		String nam = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		int sum = kor + eng + mat;
		double ave = (int)(sum/3.*100+0.5)/100.;
		double ave1 = sum/3.;
		String grade = " ";
		
		if(ave >= 90) {
			grade = "수";
		}else if(ave >= 80) {
			grade = "우";
		}else if(ave >= 70) {
			grade = "미";
		}else if(ave >= 60) {
			grade = "양";
		}else {
			grade = "가";
		}
		System.out.print("이름 : " + nam + "\n" + 
				 	 	 "총점 : " + sum + "\n" + 
				 	 	 "평균 : " + ave + "\n" +
				 		 "평균 : " + String.format(("%.2f"), ave1) + "\n" + 
				 		 "등급 : " + grade);

	}

}
