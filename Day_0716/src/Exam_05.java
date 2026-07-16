//2차원 배열의 정렬
//번호, 국어, 영어, 수학, 총점, 석차
//  0   1   2    3    4   5
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] stu = {{1,90,80,70,0,0}, {5,70,86,75,0,0}, 
				{3,95,88,77,0,0}, {4,70,78,97,0,0}, {2,89,85,75,0,0}};
		
		// 총점 계산
		for(int i = 0; i < stu.length; i++) {
			for(int j = 1; j < 4; j++) {
				stu[i][4] = stu[i][4] + stu[i][j];
			}
		}
		// 순위 계산
		for(int i = 0; i < stu.length; i++) {
			stu[i][5] = 1;
			for(int j = 0; j < stu.length; j++) {
				if(stu[i][4] < stu[j][4]) {
					stu[i][5]++;
				}
			}
		}
		// 출력(입력자료순)
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i = 0; i < stu.length; i++) {
			for(int j = 0; j < stu[i].length; j++) {
				System.out.print(stu[i][j] + "\t");
			}
			System.out.print("\n");
		}
		/*		
		//출력(석차순으로) 또는 번호순
		for(int i=0; i<stu.length-1; i++ ) {
			for(int j=i+1; j<stu.length-1; j++) {
				if(stu[i][0] > stu[j][0]) {
					//번호기준 오름차순
					for(int k=0; k<6; k++) {
						int imsi = stu[i][k];
						stu[i][k] = stu[j][k];
						stu[j][k] = imsi;
					}
				}
			}
		}
*/
		//출력(석차순으로) 또는 번호순
		//줄단위 교환(참조방식)
		
		for(int i=0; i<stu.length-1; i++ ) {
			for(int j=i+1; j<stu.length; j++) {
				if(stu[i][0] > stu[j][0]) {
					//번호기준 오름차순
					int imsi[] = stu[i];
					stu[i] = stu[j];
					stu[j] = imsi;		
				}
			}
			for(int j = 0; j < stu[i].length; j++) 
				System.out.print(stu[i][j] + "\t");
			System.out.print("\n");
		}
		;
		//출력
		//출력(번호순 자료순)
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i=0; i<stu.length; i++) {//줄
			for(int j=0; j<stu[i].length; j++) {//칸
				System.out.print(stu[i][j] + "\t");
			}
			System.out.print("\n");
		}
		

	
	
	
	
	}

}
