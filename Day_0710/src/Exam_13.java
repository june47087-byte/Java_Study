//키보드로 이름, 국어, 영어, 수학, 과학 점수를 입력 총점, 평균을 구하여
//최대 점수, 최소 점수를 출력
/* 입력 : 호일동 90 80 70 60 
 * 
 * [출력]
 * 이름 : 
 * 총점 : 
 * 평균 :
 * 최대 점수 :
 * 최소 점수 :
 */
import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 		
		System.out.print("입력 : ");
		String nam = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		int sci = scn.nextInt();
		
		
		int sum = kor + eng + mat + sci;
		double ave = (int)(sum/3.*100+0.5)/100.; // 반올림
		double ave1 = sum/3.; // 반올림 안 한 경우
		
		int max = kor;
		int min = kor;
		if(max < eng) { // 최대
			max = eng;
		}else if(min > eng) { // 최소
			min = eng;
		}
		if(max < mat) { // 최대 
			max = mat;
		}else if(min > mat) { // 최소
			min = mat;
		}
		if(max < sci) { // 최대 
			max = sci;
		}else if(min > sci) { // 최소
			min = sci;
		}
	
	
		
		System.out.print("이름 : " + nam + "\n" +
						 "총점 : " + sum + "\n" + 
						 "평균 : " + ave + "\n" +
						 "평균 : " + String.format(("%.2f"), ave1) + "\n" + 
						 "최대 점수 : " + max + "\n" + 
						 "최소 점수 : " + min);
	}

}
