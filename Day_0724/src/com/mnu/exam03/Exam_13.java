package com.mnu.exam03;
// 반복문(for(), while(), do ~ while()
public class Exam_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, sum;
		a = b = 1;
		sum = a + b;
		
		for(int i = 0; i <= 2; i++) {
			c = a + b; // 2, 3, 5
			sum += c; // 4, 7, 12
			a = b; // 1 2 
			b = c; // 2 3 
		}
		System.out.println(sum);
	}

}
