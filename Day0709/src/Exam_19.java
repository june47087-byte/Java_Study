/* 키보드로 이름 국어 영어 수학 점수를 입력 총점, 평균, 판정을 구하여 출력
 * 1. 입력은 한줄로 입력 
 * 	입력 : 김형준 99 88 79
 * 2. 평균은 소수이하 3.째자리에서 반올림
 * 3. 판정은 3과목 모두 60점 이상,평균이 80이상 "합격" 아니면 "불합격"
 * 4.불합격 사유 출력
 * 	 - 한과목이라도 60미만 인 경우 "과락"
 *   - 3과목 모두 60이상이나 평균이 89미만이면 "평균 미만"
 * 5. 출력은 다음과 같이 한다(예시)
 * 	이름		총점		평균		판정	불합격 사유
 * 	김형준	265		87.56 	합격	 
 * 	이름		총점		평균		판정	불합격 사유
 * 	김형준	265		87.56 	불합격  과락
 * 		if(kor > 60 && eng > 60 && mat > 60 && ave >= 80) {
			if(kor > 60 && eng > 60 && mat > 60) {
				str1 = "평균미만";
				System.out.print("\t" + str1);
			}else {
				str1 = "과락";
				System.out.print("\t" + str1);
			}
		}else {
			str= "불합격";
			System.out.print("\t"+ str);
		}
		System.out.print(name + "\t" + sum + "\t" + ave + "\t"+ str);
	무엇을 잘못 생각했는지 복습해보자	
	
 */
import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		System.out.println("이름\t총점\t평균\t판정\t불합격사유");
		int sum = (kor + eng + mat);
		double ave = (int)(sum/3. * 100 + 0.5) / 100.;
		String str = "불합격";
		String str1 = "평균 부족";
		if(kor > 60 && eng > 60 && mat > 60 && ave >= 80) {
			str = "합격";
			str1 = " ";
		}else {
			if(kor < 60 && eng < 60 && mat < 60) {
				str1 = "과락";
			}else {
				str1 = "평균 부족";
			}
		}
		System.out.print(name + "\t" + sum + "\t" + ave + "\t" + str + "\t" + str1);
	}

}
