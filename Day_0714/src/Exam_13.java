
//Data : 90, 75, 80, 77, 85, 79, 95, 70, 85, 90, 77
//최대값: 
//최소값;
//합계(전체합-최대-최소) :
public class Exam_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {90, 75, 80, 77, 85, 79, 95, 70, 85, 90, 77};
		
		
		System.out.print("Data : ");
		for(int s : score) {
			System.out.printf("%4d", s);
		}
		System.out.print("\n");
		
		
		int max = score[0];
		int min = score[0];
		int sum = score[0];
		for(int i=1; i<score.length; i++) {
			sum += score[i];
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}	
			
		}	
	
		
		System.out.print("최대값 : "+ max + "\n");
		System.out.print("최소값 : "+ min + "\n");
		System.out.print("합계 : "+ (sum - max - min) + "\n");
		
		
		double ave = (double)sum / score.length;
		System.out.printf("평균 :%4.1f\n", ave);
		System.out.print("평균 이상: ");
		int count = 0;
		for(int val : score) {
			if(val >= ave) {
				System.out.printf("%3d", val);
				count++;
			}
		}
		System.out.print("\n평균이상 데이터 수 : " + count);
	}

}
