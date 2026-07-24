package com.mnu.exam03;

public class Exam_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0, sum = 0;
		while(true) {
			cnt++;
			if(cnt == 5) {
				break;
			}
			sum += cnt; // 1 + 2 + 3 + 4 
		}
		System.out.print(sum);
	}

}
