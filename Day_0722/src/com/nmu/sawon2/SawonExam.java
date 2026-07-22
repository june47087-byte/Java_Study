// 사원들의 사원번호, 이름 성별, 등급, 근무시간을 입력받아서 주간 급여를 계산하는 프로그램을 완성하시오.
// 처리조건 
// - 성별은 1,3 남자 2,4 여자 
// - 사원의 주간급여는 근무시간과 시급을 곱한 값으로 한다
// - 시급은 사원의 등급이 1등급인 경우 10.000원, 2등급인 경우 5.000원 3등급인 경우 2.000원으로 한다.
// - 근무시간이 36시간을 초과한 경우 초과근무시간에 대해 시급의 1.5배를 지급하여 근무시간은 최대 50시간까지만 인정된다.
 
package com.nmu.sawon2;

import java.util.Scanner;

public class SawonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 입력(사원 정보)
		Scanner scn = new Scanner(System.in);
		System.out.print("사원등록:");
		int sabun = scn.nextInt();
		String name = scn.next();
		int gender = scn.nextInt();
		int grade = scn.nextInt();
		int time = scn.nextInt();
		
		SawonDAO dao = SawonDAO.getInstance();
		//1. 사원 객체 생성
		SawonDTO sawon = dao.getSawon(sabun, name, gender, grade, time);
		
		dao.weekpayProcess(sawon);
		
//		// 주간급여((1)등급에 따른 시급, 급여) 파악해야한다.
//		int weekPay = 2000;
//		if(sawon.getGrade()==1) {
//			weekPay =10000;
//		}else if(sawon.getGrade()==2) {
//			weekPay = 5000;
//		}
//		
//		int weekMoney =dao.weekpayProcess(sawon, weekPay);
//		
//		// 출력
//		String genderStr = "여자";
//		if(sawon.getGender() == 1 || sawon.getGender() == 3) {
//			genderStr = "남자";
//		}
		System.out.println("사원번호\t이름\t성별\t등급\t시급\t근무시간\t주간급여");
		System.out.print(sawon.getSabun() + "\t");
		System.out.print(sawon.getName() + "\t");
		System.out.print(sawon.getGenderStr() + "\t");
		System.out.print(sawon.getGrade() + "\t");
		System.out.print(sawon.getWeekPay() + "\t");
		System.out.print(sawon.getTime() + "\t");
		System.out.print(sawon.getWeekMoney()+ "\t");
	
	
		
	}

}
