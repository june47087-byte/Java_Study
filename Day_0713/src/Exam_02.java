// 1 ~15 사이의 정수를 입력,  16진수 변환 프로그램 작성
//입력값이 1~ 15 사이가 아니면 "입력오류" 출력 후 종료


import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 : ");
		int a = scn.nextInt();
		
	
		System.out.println("10진수 : " + a);	
		if(a>15 || a<1) {
			System.out.println("입력오류");
			System.exit(1);
//		}else
//			System.out.printf("16진수 : %X", a);
		}
		// 정상 입력
		int mok = a / 16; // 
		int na = a % 16;
		
//		String con = "";
//		if(na == 10) {
//			con = "A";
//		}else if(na == 11) {
//			con = "B";
//		}else if(na == 12) {
//			con = "C";
//		}else if(na == 13) {
//			con = "D";
//		}else if(na == 14) {
//			con = "E";
//		}else if(na == 15) {
//			con = "F";
//		}else {
//			con = na+""; // 문자열 정수로 int a = Integer.parseInt(con);
//		}
		String con = "";
		switch(na) {
			case 10:
				con = "A";
				break;
			case 11:
				con = "B";
				break;
			case 12:
				con = "C";
				break;
			case 13:
				con = "D";
				break;
			case 14:
				con = "F";
				break;
			case 15:
				con = "E";
				break;
			default:
				con = na+"";
		}
		
		System.out.println("10진수 : " + a);
		System.out.println("16진수 : " + con);
		
	}

}
