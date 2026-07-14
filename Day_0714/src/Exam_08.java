// 정수 배열 5개 선언후 키보드로 배열에 데이터 입력하기

import java.util.Arrays;
import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int arr[] = {10, 20 ,30, 40, 50};
		int arr2[] = new int [] {101, 20, 30, 40, 50};
		int arr3[] = new int [5];
		
		//배열 요소수
		int cnt = arr.length; 
		System.out.println("arr 배열 요소수 : " + cnt);
		System.out.println("arr 배열 요소수 : " + arr.length);
		//배열 요소 확인(출력) Arrays.toString(arr)
		System.out.println(Arrays.toString(arr));
		arr[1] = 100;
		System.out.println(Arrays.toString(arr));
		
		// 배열 요소 합계
//		int sum = arr[0] + arr[1] + ~ +arr[15];
		int sum = 0;
		for(int i = 0; i <arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("arr 배열요소 합 : " + sum);
	}

}
