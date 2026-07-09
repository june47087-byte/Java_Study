import java.util.Scanner;

public class Exam_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int val = scn.nextInt();
		
		String str = " ";
		if(val >= 80) {
			if(val <= 90) {
				// System.out.println("80~90 Pass");
				str = "80~90 Pass";
			}else {
				// System.out.println("80이상 90초과 No");
				str = "No";
			}
		}else {
			// System.out.println("80미만 No");
			str = "80미만 NO";
		}
		System.out.println(val + "점수의 결과는 " + str);
		
	}

}
