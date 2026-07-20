
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st; // 참조 변수(영어로는 레퍼런스)//Students 의 class를 불러온거다.int String boolean을 묶어서 하나의 type을 만든거다. 
			
		st = new Students();// 객체 생성
		System.out.println("st :" + st);
		System.out.println("구분 :" + st.gubun);
		System.out.println("이름 :" + st.name);
		System.out.println("성별 :" + st.max);
				
		st.gubun = 1;
		st.name = "김학생";
		st.max = true;
		
	
		System.out.println("구분 :" + st.gubun);
		System.out.println("이름 :" + st.name);
		System.out.println("성별 :" + st.max);
		
		st.studentPr();
 	}

}
