//n개의 배열에 저장된 데이터를 출력하고 합계, 평균을 구하여 출력
//Data : 90, 75, 80, 77, 85, 79, 95, 70, 85, 90, 77
//총점 : xxx
//평균 : xx.xx

import java.util.Arrays;

public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {90, 75, 80, 77, 85, 79, 95, 70, 85, 90, 77};
		
		// 기본 for() 이용시
		int sum = 0;
		System.out.print("Data : ");
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%4d", score[i]);
			sum += score[i];
		}
		double ave = (double)sum / score.length;
		char grade= 'F';
		if(ave>= 90)
			grade = 'A';
		if(ave>= 80)
			grade = 'B';
		if(ave>= 70)
			grade = 'C';
		if(ave>= 60)
			grade = 'D';
				
		System.out.print("\n합계 :" + sum);
		System.out.print("\n평균 :" + ave);
		System.out.print("\n등급 :" + grade);
		
		// 확장 for() 사용시
		sum = 0;
		System.out.print("\nData : ");
		for(int s : score) {
			System.out.printf("%4d", s);
			sum += s;
		}
		
		ave = (double)sum / score.length;
		grade= 'F';
		if(ave>= 90)
			grade = 'A';
		if(ave>= 80)
			grade = 'B';
		if(ave>= 70)
			grade = 'C';
		if(ave>= 60)
			grade = 'D';
				
		System.out.print("\n합계 :" + sum);
		System.out.print("\n평균 :" + ave);
		System.out.print("\n등급 :" + grade);
		
		
		
		
		

	}

}
