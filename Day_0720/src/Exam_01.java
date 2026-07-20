
public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = new int[5][5];
		int a = 0 	;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				a++;
				arr[i][j] = a;
				arr[i][4] += a;
				arr[4][j] += a;
				arr[4][4] += a;
				
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
