/*키보드로 점수를 입력해 입력된 점수가 80 ~ 90 사이면 Pass
 * 
 */


import java.util.Scanner;
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("입력: ");
		int score = scn.nextInt();
		
		// && 사용시
		if(score>= 80 && score<= 90) {
			System.out.println("&&(and) 사용시 Pass");
		}
		System.out.println("&&(and) 사용시 Pass");
		// && 미사용시 (70)
		if(score >= 80) {
			if(score <= 90) {
				System.out.println("&&(and) 미사용시 Pass");
			}
		}
		
	}

}
