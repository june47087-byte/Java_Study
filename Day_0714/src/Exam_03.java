// 키보드로 급여를 입력 화폐단위별 매수를 구하여 출력

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		
		int pay = scn.nextInt();
		int money = 50000;
		
		System.out.printf("급여 : %7d\n", pay);
		
		boolean flag =true;
		
//		if(!flag), if(flag) 이렇게 하면 if문이 조건식을 간단하게 할 수 있다.
		while(pay != 0) {
			System.out.printf("%5d : ", money);
			int mok = pay / money;
			System.out.printf("%3d", mok);
			pay %= money;
			
			
			//flag로 왔다갔다 전환이 가능하다. 상황에 따라 첫번째만 위로 두번째부터 아래로 계속 가능하다.
//			for문의 경우에서는 홀수 짝수가 되기때문에 따로 flag를 안 만든거다
			if(flag) {
				money = money / 5;
				flag = false;
			}else {
				money = money / 2;
				flag = true;
			}
		}
	
	}

}
