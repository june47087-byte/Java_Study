
public class Exam_05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			s = s + i; // s += i 와 동일하다
		}
		System.out.println("1 ~ 10 합 : " + s);
	
		// 1 ~ 10 홀수 출력 후 홀수 합
		int t = 0;
		for(int j = 1; j <= 10; j +=2) {
			System.out.println(j);
			t += j;
		}
		System.out.println("1 ~ 10 홀수 합 : " + t );
		
		// 1~ 10 짝수 출력 후 합계
		int yy = 0;
		for(int j = 0; j <= 10; j += 2) {
			System.out.println(j);
		}
		System.out.println("1 ~ 10 짝수 합 : " + yy );

	}
}
