package aaa;

import java.util.Scanner;
// 위의 것처럼 하면 클래스 하나만 끌어오는거다.
// 클래스 전체를 끌어오려면 패키지.*하면 패키지의 모든 클래스를 끌어 올 수 있다.
import bbb.Car;


public class Exam_07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		
		bbb.Car c1 = new bbb.Car(); // 같은 패키지면 Test처럼 끌어 올 수 있으나 다른 패키지라면 패키지.클래스 이렇게 끌어와야한다.
		
		Car c2 = new Car(); // ctrl + shift + o 하면 인포트해서 자동으로 끌어온다. 
		
		Scanner scn = new Scanner(System.in);
	}
	
}
