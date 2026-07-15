
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {90, 60, 80, 70, 55, 88, 77, 65};
		
		int[] test = score.clone();
		
		for(int i = 0; i < test.length - 1; i++) {
			for(int j = 0; j < test.length - i - 1; j++) {
				if(test[j] > test[j + 1]) {
					int imsi = test[j];
					test[j] = test[j + 1];
					test[j + 1] = imsi;
				}
			}
		}

	}

}
