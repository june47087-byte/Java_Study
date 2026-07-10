// 키보드로 입력된 정수가 80이상이면 "합격' 아니면 "불합격" 출력
import java.util.Scanner;
public class Exam_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.print("정수 입력 : ");
			double num = scn.nextDouble();
			
			if(80 <= num){
				System.out.print("합격");
			}else{
				System.out.print("불합격");
			}
		}
	}

}
