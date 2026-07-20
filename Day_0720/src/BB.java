
public class BB {
	int bun = 10;
	String name;
	int score;
	
	
	// 자신을 출력하는 메소드
	void bbprint() {
		int a; // 지역변수 = 메소드가 호출되면 만들어지고 메소드가 끝나면 사라진다. 매개 변수냐 멤버 변수나 정적변수냐 
		System.out.println("번호 = " + bun);
		System.out.println("이름 = " + name);
		System.out.println("점수 = " + score);
	}
}
