package com.mnu.exam04;

public class Exam_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int E[] =  {95, 75, 85, 100, 0};
		int i = 0;
		int Temp = 0;
		do {
			int j = i;
			do {
				if(E[i] > E[j]) {
					Temp = E[i];
					E[i] = E[j];
					E[j] = Temp;
				}
				j++;
			}while(j < 5);
			i++;
		}while( i < 4);
		for(int a = 0; a< 5; a++) {
			System.out.printf("%d ", E[a]);
		}
	}

}
