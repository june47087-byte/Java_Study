
public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		a = 77;
		// a가 90이상일때는 'A', 80이상이면 'B', 70이상이면 'C', 60이상이면 'D'
//		String grade = "";
//		switch(a) {
//		case 100:
//		case 99:
//		~~~~~~~
//		case 90:
//			grade = "A";
//			break;
//			
//		}
		int a = 88;
		String grade = " ";
		switch(a/10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		}
		System.out.print(grade);
		
	}

}
