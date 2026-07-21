class SS{
	int a = 10;
}

// 싱글톤 클래스 만들기

	class Sin {
	private Sin() {} // private는 new를 못 쓰게 막은거다 초기화 막음.
	//그럼 객체 생성은...?
	 
	static Sin s = new Sin(); // 자신 스스로 객체를 생성
	
	static Sin getSin() {
		return s; 
	}
}
public class Exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SS s1 = new SS(); // 객체(인스턴스) 생성 s1 s2 s3 다 같이 사용하겠다 이게 싱글 톤
		SS s2 = new SS();
		SS s3 = new SS();
		
		System.out.print("s1 = " + s1);
		System.out.print("s2 = " + s2);
		System.out.print("s3 = " + s3);
		//Sin s = new Sin(); //  new를 못 쓰게 막아놓은거다. 
		
		Sin sin1 = Sin.getSin();
		Sin sin2 = Sin.getSin();
		System.out.print("sin1 = " + sin1);
		System.out.print("sin2 = " + sin2);
		
	}

}
