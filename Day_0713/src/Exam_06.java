//1 ~ 10 까지 홀수 합, 짝수 합
public class Exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		표시 후 짝, 홀수의 합을 계산하라
		int s = 0; // 홀수 합
		int t = 0; // 짝수 합
		int sum = 0; // 총 합 
		for(int i = 1; i < 11; i++) {
			System.out.println(i);
			if(i % 2 == 1) {
				s += i;
			}else {
				t += i;
			}
			sum += i;
		}
		
		System.out.println("홀수의 합 : " + s);
		System.out.println("홀수의 합 : " + t);
		System.out.println("총합 : " + sum);
	}

}
