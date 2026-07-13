/* 키보드로 7개의 점수를 입력 최대, 최소, 합계(합계 - 최대 - 최소)
 * 출력하는 프로그램 작성
 * for(), while()
 * 입력 : 9 5 8 6 3 7 6
 * 
 * 최대 : 9
 * 최소 :3
 * 합계(합계 - 최대 - 최소) : (44 - 9 - 3) : 32
 */

import java.util.Scanner;

public class Exam_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scn.nextInt();
		int max = score;
		int min = score;
		int tot = score;
		
		int cnt = 1;
		while(cnt < 7) {
			score = scn.nextInt();
			tot += score;
			if(max < score) {
				max = score;
			}
			if(min > score) {
				min = score;
			}	
			cnt++;
		}	
		int sum = tot - max - min;
		System.out.println("최대점수 : " + max);
		System.out.println("최소점수 : " + min);
		System.out.println("합계(합계 - 최대 - 최소) :" + "(" + tot + "-" + max + "-" + min +")" + ":" + sum);

	}

}
