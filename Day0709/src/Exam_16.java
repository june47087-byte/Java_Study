/* 키보드로 이름 국어 영어 수학 점수를 입력 총점, 평균, 판정을 구하여 출력
 * 1. 입력은 한줄로 입력 
 * 	입력 : 김형준 99 88 79
 * 2. 평균은 소수이하 3.째자리에서 반올림
 * 3. 판정은 3과목 모두 60점 이상,평균이 80이상 "합격" 출력
 * 4. 출력은 다음과 같이 한다(예시)
 * 	이름		총점		평균		판정
 * 	김형준	265		87.56 	합격
 */
import java.util.Scanner;

public class Exam_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		String name = scn.next();
		int kor = scn.nextInt();
		int eng = scn.nextInt();
		int mat = scn.nextInt();
		
		System.out.println("이름\t총점\t평균\t판정");
		int sum = (kor + eng + mat);
		double ave = (int)(sum/3. * 100 + 0.5) / 100.; // 모르겠다. 집중적으로 알아보자.
		String judgment = " "; //그리고 위의 정수와 실수는 = 0 안만들어도 되는데 왜 string은 =" "; 넣어줘야 하는가.
		if(kor > 60 && eng > 60 && mat > 60 && ave >= 80) {
			judgment = "합격";
		}else {
			judgment = "불합격";
		}
		//else 안쓰는 방법 String judgment = "불합격";  넣어두면 80 이상일 때 "합격"으로 바꿔주면 된다.
		System.out.print(name + "\t" + sum + "\t" + ave + "\t" + judgment);
	
	
	
	}

}
