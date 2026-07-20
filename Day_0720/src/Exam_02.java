	//다음 입력 형식과 같이 입력 받은 후 동별, 나이별 통게를 구하는 프로그램 작성
	//처리조건
	//- 동은 1 ~ 10까지 10개의 동이 있다.
	//- 동 코드로 0이 입력되면 입력을 종료하고 출력한다.
	// 생각을 했는데 너무 복잡하게 하려고 했던것 같다. 이렇게 해보려 했다고 남긴다. Exam_02_1에 제대로 된 해답을 남김.
	import java.util.Scanner;
	
	public class Exam_02 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			int [][] arr = new int[11][8];
			while(true) {
				System.out.print("입력");
				int don = scn.nextInt();
				if(don == 0)
					break;
				int age = scn.nextInt();
				
				for(int i = 0; i < arr.length - 1; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						if(age/10 == 0) {
							arr[don][0] += 1; 
						}else if(age/10 == 1) {
							arr[don][1] += 1;
						}else if(age/10 == 2) {
							arr[don][2] += 1;
						}else if(age/10 == 3) {
							arr[don][3] += 1;
						}else if(age/10 == 4) {
							arr[don][4] += 1;
						}else if(age/10 == 5) {
							arr[don][5] += 1;
						}else {
							arr[don][6] += 1;
						}
						arr[don][7] += arr[don][j];
					}
				}
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr.length; j++) {
						System.out.print(arr[i][j]+"\t"); 
					}
					System.out.print("\n");
				}
			
			}
		}
	
	}
