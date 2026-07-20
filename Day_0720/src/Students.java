
public class Students {
	// 속성(변수)
	int gubun;// 초(1), 중(2), 고(3), 대(4) 
	String name; // 이름 구분
	boolean max;// 성별(true : 남자/ false : 여자)
	
	// 기능
	// 자신 소개 기능
	void studentPr() {
		System.out.println("저는" + gubun + "이고 ");
		System.out.print("이름은" + name + "입니다 ");
		
	}
}
