//1 ~ 10 합계 ( 10 + 9 + ... +!) = 55
public class Exam_16 {
	static int funcSum(int num) {
		if(num == 1) {
			return 1;
		}
		return num + funcSum(num - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(funcSum(10));
	}

}
