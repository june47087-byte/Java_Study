//키보드로 7개의 데이터를 입력 총점, 평균을 구하여 출력
//for()문을 이용해서 출력하라.
import java.util.Scanner;
public class Exam_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("데이터 입력 : ");
		
		int tot = 0;
//		for(int i =1; i<=7; i++);{
//			int a = scn.nextInt();
//			tot = tot + a;
//		}
		
		//반복문을 돌릴때 초기 값이 0이면 <로 사용 1이면 <=로 사용
		int cnt = 0; // 데이터 수 카운트
		while(cnt<7) {
			int a = scn.nextInt();
			cnt++;
			tot += a;
		}
		
		System.out.println("합계 : " + tot);	
	
	
	}

}
