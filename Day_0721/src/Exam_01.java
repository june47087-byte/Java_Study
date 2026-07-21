//회원강비 로그인 로그아웃 기능 구현 회원정보 이름,아이디 비번 연락처) 로그인 : 아이디, 비번
//
//입출력 예시
//1. 회원가입 : 이름, 아이디, 비번, 연락처
//회원정보가 입력되었습니다./회원정보를 모두 입력하세요
//
//2.로그인 : 아이디 비번
public class Exam_01 {
	public static void main(String[] args) {
		//회원가입
		Member m1 = new Member();
		m1.name = "강학생";
		m1.id = "abcd";
		m1.pass = "1234";
		m1.phone = "010-2222-2222";
		
		
		boolean bool = m1.memberRegister();
		if(bool) {
			System.out.print("회원가입 성공");
		}else {
			System.out.print("회원가입 실패");

		}
		Member m2 = new Member("이사람", "user", "1234", "010-1111-1111");
		bool = m2.memberRegister();
		if(bool) {
			System.out.print("회원가입 성공");
		}else {
			System.out.print("회원가입 실패");

		}
	}

}
