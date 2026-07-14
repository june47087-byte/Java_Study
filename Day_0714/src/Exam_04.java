
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <= 5; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (6-i)*2-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.println("--------------------");
		for(int i = 5; i >= 1; i--) {
			for(int k = 1; k < (6 - i); k++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
