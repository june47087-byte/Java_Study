/* 초기화 연습용
 * if(b < 10) {
			a = 100;
		} 하면 b가 10 이상일때 a 값이 초기화 되지 않아 에러가 난다. 
		그러니 위에 초기화 해주기 else 써서 어디든 들어가게 만들면 초기화는 필요가 없다.  
 * 
 */
import java.util.Scanner;
public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a; // 변수선언
//		a = 0; // 초기화(임의의 값을 준거다.)
//		int b =10; // 변수선언과 초기화
//		if(b < 10) {
//			a = 100;
//		}else {
//			a = 20;
//		} 
//		System.out.println("a = " + a);
//		System.out.print("b = " + b);
//		


		Scanner scn = new Scanner(System.in);
		
		System.out.print("정수 2개 입력 : ");
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		// a= 7, b = 5면 출력할 때 7>5와 7==5 두개 입력된다. a = 5, b = 7 일때 는 5<7 이 나온다.
		// 아래 if문이 별개로 출력해 a>b 조건 확인하고 a<b 조건 두개 하기에 a>b 걸리면 출력하고 a<b 걸리지 않으면 if 첫번째는 출력 안함
/*		if(a>b) {
			System.out.println(a + ">" + b);
		}		
		if(a<b) {
			System.out.println(a + "<" + b);
		}else {
			System.out.println(a + "==" + b);
		}
*/
		System.out.print(5 % 3);
		if(a>b) {
			System.out.println(a + ">" + b);
		}else { // a < b, a == b
			if(a<b) {
				System.out.print(a + "<" + b);
			}else {
				System.out.print(a + "==" + b);
			}
		}
		
	}

}
