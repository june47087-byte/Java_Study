//다음 입력 형식과 같이 입력 받은 후 동별, 나이별 통게를 구하는 프로그램 작성
//처리조건
//- 동은 1 ~ 10까지 10개의 동이 있다.
//- 동 코드로 0이 입력되면 입력을 종료하고 출력한다.

import java.util.Scanner;

public class Exam_02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int [][] arr = new int[11][8];
		while(true) {
			System.out.print("입력");
			int don = scn.nextInt();
			if(don == 0) {
				break;
			}
			String na = scn.next();
			int age = scn.nextInt();
			int col = age/10;
			if(col > 6) {
				col = 6;
			}
			arr[don - 1][col] ++;
			arr[don - 1][7] += arr[don - 1][col];
			arr[10][col] += arr[don - 1][col];
			arr[10][7] += arr[don - 1][col];
		}
			System.out.print("동\t0~9\t10~19\t20~29\t30~3\t940~49\t50~59\t60이상\t합계" + "\n"); 
			for(int i = 0; i < arr.length - 1 ; i++) {
				System.out.print((i + 1) + "\t");
				for(int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				}
				System.out.print("\n");
			}
			System.out.print("합계\t");
			for(int i = 0; i < arr[0].length; i++) {
				System.out.print(arr[arr.length - 1][i] + "\t");
			}
	}
	
}

