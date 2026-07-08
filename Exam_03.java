// System.out.printf();
// 변환기호 : %d(10진수(정수), %f(실수), %c(문자), %s(문자열))
public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Hello \n"); 
		System.out.printf("정수 %d \n", 200); 
		System.out.printf("실수 %f \n", 3.14); 
		System.out.printf("문자 %c \n", 'a'); 
		System.out.printf("문자열 %s \n", "Hello"); 

		System.out.printf("정수 = %d 실수 = %f 문자열 %s \n", 100,3.1234,"Hello"); 
		
		// 'A - 65, 'a' -97, '0' - 48
		// System.out.printf("A = %d", 'a')는 안되지만 	System.out.printf("A = %c", 65); 는 가능하다.
		// 변환기호라고 부른다. (제미나이에게 물어볼것. 주석인데 왜 65가 A가 되는지
		System.out.printf("A = %c\n", 65);
		// \t을 쓰면 균일하게 띄어쓰기가 된다. 아래의 예시가 보여준다. 문자 뒤의 띄어쓰기도 영향이 간다 ctrl+F11로 확인해보자.
		System.out.printf("국어      영어    수학 총점  평균\n");
		System.out.printf("국어\t영어\t수학\t총점\t평균\n");
		System.out.printf("국어\t 영어\t 수학  \t총점     \t평균");
		
		
	}

}
