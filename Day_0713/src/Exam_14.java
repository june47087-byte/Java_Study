//while(), do ~ while() 차이점
public class Exam_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0;
		while(a > 5) {
			a++;
			System.out.println(a);
		}
		
		do {
			b++;
			System.out.println(b);
		}while(b > 5);
		
		
		//while()은 조건식이 위에 있기에 값이 조건식에 맞지 않다면 아예 동작하지 않음.
		// do ~ while()은 조건식이 아래 있기에 조건식에 맞지 않더라도 한번은 동작한다.
	}

}
