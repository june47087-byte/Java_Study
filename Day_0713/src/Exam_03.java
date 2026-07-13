//키보드로 이름, 국어, 영어, 수학 점수를 입력 총점, 평균을 구하여 출력하는 프로그램 작성
//(단, 3과목 모두 60이상이고 평균 80이면 "합격" 아니면 "불합격"을 출력)
//불합격인 경우는 불합격 사유를 출력
//불합격 사유는 한과목만이라도 40미만이 있는 경우 "과락", 3과목 모두 40 이상이지만 평균이 60미만이면 "평균미만"을 출력

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		String nam = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		int sum = kor + eng + mat;
		double ave = sum/3.;
		System.out.println("이름 : " + nam);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : "+ ave);
//		if(kor >= 40 && eng >= 40 && mat >= 40 && ave >=60) {
//			System.out.print("판정 : 합격");
//		}else if((kor < 40 || eng < 40 || mat < 40) && ave < 60) {
//			System.out.println("판정 : 불합격");
//			System.out.println("사유 : 평균미만");
//		}else {
//			System.out.println("판정 : 불합격");
//			System.out.println("사유 : 과락");
//		}	
		
		String result = "불합격";
		String etc = "평균미만";
		if(kor >= 40 && eng >= 40 && mat >= 40 && ave >=60) {
			result = "합격";
		}else {
			if(kor < 40 || eng < 40 || mat <40) {
				etc = "과락";
			}
		}
		System.out.println("이름 : " + nam);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : "+ ave);
		System.out.println("판정 : " + result);
		if (etc.equals("평균미만") || etc.equals("과락")) {
		    System.out.println("사유 : " + etc);
		}
	}

}
