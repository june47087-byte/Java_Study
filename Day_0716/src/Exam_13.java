
public class Exam_13 {
	//총점을 구하는 메소드
		static void tot(int[][] a) {
			int[][] stu = a.clone();
			for(int i = 0; i < stu.length; i++) {
				for(int j = 1; j < 4; j++) {
					stu[i][4] = stu[i][4] + stu[i][j];
				}
			}
		}
	//순위를 구하는 메소드
	static void rank(int[][] a) {
		int[][] stu = a.clone();
		tot(stu);
		for(int i = 0; i < stu.length; i++) {
			stu[i][5] = 1;
			for(int j = 0; j < stu.length; j++) {
				if(stu[i][4] < stu[j][4]) {
					stu[i][5]++;
				}
			}
		}
	}
	//출력 메소드
	static void ransk(int[][] var) {
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i = 0; i < var.length; i++) {
			for(int j = 0; j < var[i].length; j++) {
				System.out.print(var[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		
		//번호, 국어, 영어, 수학, 총점, 석차
		int[][] arr ={{1,90,80,70,0,0}, {5,70,86,75,0,0}, 
			{3,95,88,77,0,0}, {4,70,78,97,0,0}, {2,89,85,75,0,0}};
		
		//총점을 구하는 메소드 호출
		tot(arr);
		ransk(arr);
	
		//순위를 구하는 메소드 호출
		rank(arr);
		ransk(arr);
		//순위를 기준으로 오름차순 하는 메소드
		
		//cn
	}
}
