
public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =25;
		int x;
		for(x = 2; x <= a ; x++) {
			if(a % x == 0) {
				break;
			}
		}
		if(x == a) {
			System.out.println(a + "는 소수");
		}else {
			System.out.println(a + "는 소수아님");

		}
	}

}
