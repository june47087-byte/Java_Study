//소수 판별  : 소수는 1과 자신 이외로 나눠지지 않는 수


public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =9;
		for(int x = 2; x <= a; x++) {
			if(a % x == 0) {
				if(x == a) {
					System.out.println(a + "소수입니다");
					break;
				}else {
					System.out.println(a + "소수가 아닙니다.");
					break;
				}
			}
		}
	}

}
