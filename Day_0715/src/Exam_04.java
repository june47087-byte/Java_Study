import java.util.Arrays;
import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int [] score = {90, 60, 80, 70, 55, 88, 77, 65};
		
		
		// 배열 데이터 확인 
		System.out.println("Data 확인 : " + Arrays.toString(score));
		
		// 배열 데이터를 출력할 시
		System.out.print("Data : ");
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.print("\n");
		
		// 배열 데이터를 출력할 때 확장 for()문 사용 처음부터 끝까지 사용한다.
		System.out.print("Data : ");
		for(int data : score) {
			System.out.print(data + " " );
		}
		System.out.print("\n");

		//합계, 평균, 최대, 최소 아래의 방식은 배열의 첫째 자리를 할당했기에 확장 for()문을 사용하지 못한다.
//		int sum= 0, max = 0, min = 0; 아래의 함수를 이렇게 바꿔보니 최소가 0으로 나온다. 아마 score 배열에서 0 아래가 없으니 이런듯 그래서 [0]을 할당한듯하다.
		
		int sum= score[0], max = score[0], min = score[0];
		for(int i = 1; i < score.length; i++) {
			sum += score[i];
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ((double)sum/score.length));
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		
		//정렬
		int scoreCp[] = score.clone();
		for(int i = 0; i < scoreCp.length - 1; i++) {
			for(int j = i + 1; j < scoreCp.length; j++) {
				if(scoreCp[i] > scoreCp[i]) {
					int imsi = scoreCp[i];
					scoreCp[i]= scoreCp[j];
					scoreCp[j]= imsi;
				}
				
			}
			
		}
		System.out.println("정렬 전 : " + Arrays.toString(score));
		System.out.println("정렬 후 : " + Arrays.toString(scoreCp));
		
		
	}

}
