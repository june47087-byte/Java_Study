/* 정수 배여 ㄹ5개 선언
 * 키보드를 이용하여 배열에 데이터 저장
 * 배열[0] = 10
 * 배열[1] = 30
 * 
 * 배열 요소 출력 후 합계 출력
 */

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int score[] = new int[5];
		
		// 배열에 데이터 입력
		for(int i = 0; i < 5; i++) {
			System.out.print("score[" + i + "] =");
			score[i] = scn.nextInt();
		}
		
		// 출력 및 합계
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i]+ "  ");
			sum += score[i];
		}
		
		System.out.print("=" + sum);
		
		//출력 및 합계 (확장for()
		int sum2= 0;
		for(int a : score) {
			System.out.print(a  + "  ");
			sum2 += score[a];
		}
		System.out.print("\n");

	}

}
