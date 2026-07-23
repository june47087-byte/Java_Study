package com.mnu.exam;

public class CalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate c1 = new calculate();
		c1.add(1, 2);
		c1.add();
		calculate c2 = new calculate(1);
		c2.add();
		c2.add(0, 2);
		calculate c3 = new calculate(1, 2);
		c3.add();
		c3.add(2, 4);
		
	}	

}
