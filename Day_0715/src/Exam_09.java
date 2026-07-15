
public class Exam_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5]; // {{0,0,0,0,0}{==}{==}{==}{==}}이다
		// 출력
		for(int i= 0; i < 5; i++) {// 칸수 모르면 arr.length 사용합시다.
			for(int j = 0; j < 5; j++) {
			
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
		// 출력
		int cnt = 0;
		for(int i= 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				cnt++;
				arr[i][j] = cnt;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
	}

}
