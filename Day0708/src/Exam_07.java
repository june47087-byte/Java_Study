import java.util.Scanner;
/* Scanner라는 것은 키보드로 무언갈 입력받겠다는 의미다. 정확히는 Scanner scn = new Scanner(System.in); 만들어야 한다
 * ctrl + shift + o(영문)을 입력하면 위의 import java.util.Scanner;가 뜬다. 이건 제미나이한테 물어봐야한다.
 * 문자열일때는 next() 인듯 
 * 정수는 nextInt() 실수는 nextDouble() 이다. 이걸로 커버 다 가능하다고 하다고 한다.
 *   이름 : 
 *   국어 : 
 *   영어 : 
 *   수학 :
 *   이름		총점 		평균
 *   실제 이름 총점    평균 
 * 
 */
public class Exam_07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String na = scn.next();
		System.out.print("국어 : ");
		int kor = scn.nextInt();
		System.out.print("영어 : ");
		int eng = scn.nextInt();
		System.out.print("수학 : ");
		int mat = scn.nextInt();
		
		int tot = kor+ eng + mat;
		double ave = tot / 3.;
		// double ave =  (double)tot / 3; // 형변환
		
		System.out.println("이름\t총점\t평균");
		System.out.println(na + "\t" + tot + "\t" + ave);
	}

}
