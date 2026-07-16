//정수형 배열에 다음과 같이 데이터가 저장되었을 경우 다음과 같이 출력 선택과 거품정렬을 사용해보자.
//int score[] = {90, 60, 80, 70, 55, 88, 77, 65}

import java.util.Arrays;

public class Exam_01 {
	public static void main(String[] args) {
		int score[] = {90, 60, 80, 70, 55, 88, 77, 65};
		int scoreCp[] = score.clone();
		
		System.out.print("정렬 전 : ");
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		for(int i = 0; i < score.length - 1; i++) {
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] > score[j]) {
					int imsi = score[i];
					score[i]= score[j];
					score[j]= imsi;
				}
				
			}
		}
		System.out.print("\n선택 정렬 후 : ");	
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		
		for(int i = 0; i < scoreCp.length - 1; i++) {
			for(int j = 0; j < scoreCp.length - i - 1; j++) {
				if(scoreCp[j] < scoreCp[j + 1]) {
					int imsi = scoreCp[j];
					scoreCp[j] = scoreCp[j + 1];
					scoreCp[j + 1] = imsi;
				}
			}
		}
		System.out.print("\n거품 정렬 후 : ");
		for(int i = 0; i < scoreCp.length; i++) {
			System.out.print(scoreCp[i] + " ");
		}
	}
}
