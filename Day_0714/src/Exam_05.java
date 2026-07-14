
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		for(int i=1; i<=5; i++) {
			for(int k = 1; k <= 6 - i; k++) {
				System.out.printf("%3s", " ");
			}
			for(int j = 1; j<= i; j++) {
				n++;
				System.out.printf("%3d", n);
			}
			System.out.print("\n");
		}	
			
	}

}
