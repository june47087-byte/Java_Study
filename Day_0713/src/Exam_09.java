import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int pay = scn.nextInt();
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
			if(pay == 0) {
				break;
			}

		}
	}
}
