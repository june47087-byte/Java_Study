//반복문 for while do~while
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//이름을  5번 출력해야한다면
		int i;
		for(i=1; i<5; i++) {
			System.out.println(i + "jane doe");
		}
		System.out.println("i = " + i);
//		System.out.print(i); // 불가능 i는 지역변수이기에 for문 바깥에 i를 만들면 사용 가능하다.
		  
		int j;
		for(j = 0; j<5; j+=2) {
			System.out.println(j);
		}
		System.out.println(j);
		
		for(int k=1; k<6; k++) {
			System.out.print(k);
		}
	}

}
