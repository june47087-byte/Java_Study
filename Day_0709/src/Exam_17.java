import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수입력(1~200)");
		int a = scn.nextInt(); // char a = (char)a.nextInt(); 도 가능하다고 한다. 그래서 if문 여러개 써도 문제가 없다. 어느 조건에서 안되는지는 제미나이이
		if(a< 1 || a>200) {
			System.out.println("입력오류");
			System.exit(1);
		}
		if(a >= 65 && a <= 90) {
			System.out.println("a=" + (char)a);			
		}
		if(a >= 97 && a <= 112) {
			System.out.println("a=" + (char)a);			
		}
		if(a >= 'A' && a <= 'Z') {
			System.out.println("대문자=" + (char)a);			
		}//int형일때만 위의것이 가능하다고 한다.
		if(a >= 'a' && a <= 'z') {
			System.out.println("소문자=" + (char)a);			
		}
	}

}
