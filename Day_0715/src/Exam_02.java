//키보드로 10진수, 변활할 진수 입력 진법변환 프로그램 작성

import java.util.Scanner;
// 2, 8 진수 변환만 된다.
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("10진수 : ");
			int dec = scn.nextInt();
			if(dec == 0) {
				System.out.println("System exit");
				break;
			}	
			System.out.print("변환(2, 8, 16) : ");
			int con = scn.nextInt();
			//진법 변환
			String str = "";
			int imsi = dec;
			while(imsi != 0) {
				//int mok = imsi / con;
				int na = imsi % con;
				switch(na) {
				case 10:
					str = "A" + str;
					break;	 
				case 11:
					str = "B" + str;
					break;	 
				case 12:
					str = "C" + str;
					break;	 
				case 13:
					str = "D" + str;
					break;	 
				case 14:
					str = "E" + str;
					break;	 
				case 15:
					str = "F" + str;
					break;
				default:
					str = na + str; // 나머지가 0~9 까지 일때 작동
				}
				str = na + str;
				//imsi = mok;
				imsi = imsi / con; 
				
				
			}
			System.out.println("10진수 : " + dec);
			System.out.println(con + "진수 : " + str);
		}
	}

}
