// 연산자(++, --)
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		int b=0;
		
		a++;//후위형 (5+1) == 6
		++a;//전위형 (6+1) == 7
		System.out.println("a = "+ a); // 7
		
		a = 5;
		b = a++;// 대입후 연산하라
		System.out.printf("a=%d\tb=%d\n", a,b); // 7
		
		a = 5;
		b = ++a;// 대입후 연산하라
		System.out.printf("a=%d\tb=%d\n", a,b); // 7
		
		
	}

}
