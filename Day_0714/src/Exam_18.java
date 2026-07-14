// 데이터 정령(오름차순,내림차순)
//1. 선택정렬법 : selection sort
//2. 거품정렬법 : bubble sort
//3. 삽입정렬법 : insertion sort
//4. 힙정렬    : heap sort 

import java.util.Arrays;

public class Exam_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택정렬이란?
		int arr[] = {7, 5, 9, 8, 3};
		int brr[] = arr.clone();
		
		for(int i = 0; i< brr.length - 1; i++) {
			for(int j = i + 1; j < brr.length; j++) {
				if(brr[i] > brr[j]) { // 내림차순은 > 하면 된다.
					int imsi = brr[i];
					brr[i] = brr[j];
					brr[j] = imsi;
				}
			}
		}
		
		System.out.print("정렬전 : " + Arrays.toString(arr));
		System.out.print("정렬후 : " + Arrays.toString(brr));
	}

}
