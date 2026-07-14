//n개의 배열에 저장된 데이터를 출력하고 합계, 평균을 구하여 출력
//마지막에 평균을 구항 ㅕ출력 하고 평균 이상 데이터 및 데이터 수 출력
//Data : 90, 75, 80, 77, 85, 79, 95, 70, 85, 90, 77
//평균 : 83.0
//평균 이상 : 90 85 95 85 90
//평균이상 데이터 수 : 5

public class Exam_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {90, 75, 80, 77, 85, 79, 95, 70, 85, 90, 77};
		int sum = 0;
		
		for(int s : score) {
			sum += s;
		}
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
