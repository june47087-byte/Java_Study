//키보드로 10진수, 변환할 진수(2, 8 ,16)

import java.util.Scanner;

public class Exam_19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("10진수 : ");
		int dec = scn.nextInt();
		System.out.print("변활할 진수 : ");
		int con = scn.nextInt();
		
		int imsi = dec;
		String str = ""; // 변환된 진수
		
		while(imsi != 0) {
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
				str = na +str; //나머지 값이 0 ~ 9
				
			}
			// str = na + str; 
			//2진수나 8진수는 이걸로 가능하다. 그러나 16진수는 a b 알파벳이 나와야 한다. 그래서 switch case를 쓴다.
			imsi = imsi / con;
		}
		System.out.println("10진수 :" + dec);
		System.out.println(con + "진수 :" + str);

	}

}
