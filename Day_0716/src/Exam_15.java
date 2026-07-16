//!(팩토리얼)을 계산해보자. stack을 이용한다.
public class Exam_15 {
	static int function(int num) {
		if(num == 0) {
			return 1;
		}
		return num * function(num-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function(5);
		
	}

}
