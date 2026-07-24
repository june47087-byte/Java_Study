package com.mnu.exam02;

public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w = 3, x = 4, y = 3, z = 6;
		if((w == 2 | w == y) & !(y > z) & (1 == x ^ y != z)) { // (0 | 1) & !(0) & (0 ^ 1)
			w = x + y;
		}else {
			w = y + z;
		}
		System.out.print(w);
	}
	
}
