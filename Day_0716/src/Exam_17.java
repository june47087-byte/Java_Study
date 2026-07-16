
public class Exam_17 {
	// 1 ~ 10 홀수 합을 반환하는 함수
	static int funcOdd(int num) {
		if(num % 2 == 1) {
			if(num == 1) {
				return 1;
			}
			return num + funcOdd(num - 1);
		}
		else {
			return funcOdd(num - 1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(funcOdd(10)); // 25
	}

}
