package com.mnu.exam;
class AA {
	int a = 100;
}
class ChAA extends AA {
	int a = 1000;
}
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a1 = new AA();
		// a1 이라는 변수에 AA { a = 10 }
		ChAA ca1 = new ChAA();
		// ca1이 만들어지만 AA{ a = 10 } 만들어지고 상속 받아서 ChAA { a =1000 } 이런 순으로 만들어진다. 피상속인이 없으면 상속인이 없으니까 
	}

}
