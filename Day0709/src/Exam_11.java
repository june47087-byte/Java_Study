// 조건 연산자
// 키보드로 숫자를 입력 홀수 또는 짝수를 판별하여 출력
import java.util.Scanner;
public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수입력?");
		int jum = scn.nextInt();
		
		// 결과를 짝수이면 true, 홀수 이면 false
		boolean boo = jum%2 == 0;
		System.out.println(boo);
		
		// 결과를 짝수이면 false, 홀수 이면 true
		boolean bool = jum%2 == 1;
		System.out.println(bool);
		
		//결과 값이 "홀수", "짝수"
		//String boolB = jum%2==1;
		//String str1 = boolB;
		//System.out.println(jum + "는" + str1);
		
				
	//	String str = (jum%2==0) ? "짝수" : "홀수";
		//System.out.println(jum + "는" + str);
		// jum이 2로 나눈 나머지가 1인가? 맞으면 "홀수", 틀리면 "짝수"를 str1에 넣어라!
		String str1 = (jum % 2 == 1) ? "홀수" : "짝수"; 

		System.out.println(jum + "는 " + str1);
		
	}

}
