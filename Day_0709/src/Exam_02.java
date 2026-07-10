// 형변환 예제
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A'; // 문자(1문자 ' ') 또는 정수(65000)
		int in1 = 65;
		double do1 = 3.14;
		
		int chInt = ch; // 문자를 정수로 형변환(자동) == > 65
		System.out.println("chInt = " + chInt); 
		// 괄호 우선주의 문자열과 + 하면 뭐든 문자열이된다.
		// "a" + 2 = "a2", 2 + "a" = "2a", 1 + 2 + "a" = "3a" 그럼 1+"a"+2="1a2" 인가? 물어보기
		
//		char intCh = in1; // 에러난다. 4바이트를 2바이트에 집어넣으니까
		char intCh = (char)in1; //이렇게 형 변환해줘야 에러가 안난다		
		System.out.println("intCh = " + intCh);
		int a = 75000;
		char intCh1 = (char)a;
		System.out.println("intCh1 = " + intCh1);
		// char은 65000까지인데 75000을 집어넣으면 모르기에 아무 문자를 넣어버린다.
		
		int intA = 100;
		double intDouble = intA; // 자동 형변환
		System.out.println("intDouble = " + intDouble); //100.0
		
		double doubleA = 3.14;
		int doubleInt = (int)doubleA;
		System.out.println("doubleInt = " + doubleInt); // 3 

		
	}

}
