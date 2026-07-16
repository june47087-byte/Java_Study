/*키보드로 학생점수를 입력 받아서 젓대별 인원수를 출력 입력자료에 -99가 있는 경우 입력자료의 끝
입력 예시
입력 : 88 79 90 79 80 75 60 80 55 57 90 74 -99
출력 예시
100 ~ 90 : 2
89 ~ 80 : 3
~~~~~
49 ~ 0 : 0

입력자료 : 12건
*/

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int stu[] = new int[6];
		int tot = 0;
		System.out.print("입력 : ");
//		내가 생각해 본것 
//		while(true) {
//		    int score = scn.nextInt();
//		    
//		    if(score == -99) {
//		        break;
//		    }
//		    tot++;
//		    
//		    if (score >= 90) {
//		        stu[0]++; 
//		    } else if (score >= 80) {
//		        stu[1]++; 
//		    } else if (score >= 70) {
//		        stu[2]++; 
//		    } else if(score >= 60) {
//		    	stu[3]++;
//		    } else if(score >= 50) {
//		    	stu[4]++;
//		    } else {
//		    	stu[5]++;
//		    }
//		    
//		}
		while(true) {
		    int score = scn.nextInt();
		    
		    if(score == -99) {
		        break;
		    }
		    tot++;
		    int index;
		    if (score >= 90) {
		    	index = 0;
		    } else if(score >= 80) {
		        index = 1;
		    } else if (score >= 70) {
		        index = 2;
		    } else if(score >= 60) {
	    		index = 3;	    	
		    } else if(score >= 50) {
		    	index = 4;
	        } else {
		    	index = 5;
		    }
		    	stu[index]++;
		}
//		int line[] = {100, 89, 79, 69, 59, 49};
//		int line2[] = {90, 80, 70, 60, 50, 0};
		String[] str = {"100 ~ 90", "89~80", "79~70", "69~60", "59~50", "49~0"};
		for(int i = 0; i<str.length; i++) {
//				System.out.println(line[i] + "~" + line2[i] + ":" + stu[i]);
				System.out.println(str[i] + ":" + stu[i]);
			
		}
		
	
		System.out.println("입력자료 : " + tot + "건");
	}

}
