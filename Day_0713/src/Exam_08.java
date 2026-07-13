//화폐단위별 매수 출력
//50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1
//176874 =>
//176874/50000 -> 3 - 26874 -> 10000
import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
//		int pay = 176874;
//		in mok = pay / 50000;
//		int na = pay % 50000;
//		
//		int na2 = 0; 
//		mok = na / 10000;
//		na2 = na % 10000;
//	
		int pay = 176874;
		int money = 50000;
		
		for(int i =1; i<=10; i++) {
			System.out.print(money + "원 : ");
			int mok = pay / money;
			System.out.println(mok);
			pay = pay % money;
//			money /= 5; // money = money/5
			
			if(i%2 == 1) {
				money /= 5; // money = money / 5
			}else {
				money /= 2; // money = money / 2
			}
			
		}
	
	}

}
