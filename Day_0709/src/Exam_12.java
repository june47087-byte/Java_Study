//키보드로 실수를 입력 입력된 값이 85~ 95 사이면 "pass"
// 아니면 "no" 출력하는 프로그램 작성
import java.util.Scanner;
public class Exam_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.print("정수입력");
			double num = scn.nextDouble();
			if(num == 0) {
				System.out.println("Pass"); 
				break;
				}
			System.out.println("Program End");
			
			String str = (num >= 85 && num <= 95) ? "Pass" : "No";
			System.out.println(num + "는 " + str);
			
			boolean bool1 = num >= 85;
			boolean bool2 = num <= 95;
			String str1 = (bool1 && bool2) ? "Pass" : "No";
			System.out.println(num + "는 " + str1);
			
		}	
	}

}
