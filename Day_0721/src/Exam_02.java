
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m2 = new Member("이사람", "user", "1234", "010-1111-1111");
		
		// 키보드로 입력했다 가정
		String id = "user";
		String pass = "1234";
		boolean bool = m2.memberLogin(id, pass);
		if(bool) { // 로그인 성공
			System.out.print("로그인 성공");
		}else { // 아이디 또는 비밀번호 오류입니다.
			System.out.print("아이디 또는 비밀번호 오류입니다.");
		}
		// 로그아웃(회원탈퇴)
		if(bool) {
			String str = m2.memberLogout();
			System.out.println(str);
		}
		// 다시 로그인
		bool = m2.memberLogin(id, pass);
		if(bool) { // 로그인 성공
			System.out.print("로그인 성공");
		}else { // 아이디 또는 비밀번호 오류입니다.
			System.out.print("아이디 또는 비밀번호 오류입니다.");
		}
		
//		id = "user";
//		pass = "1234";
//		bool = m2.memberLogin(id, pass);
//		if(bool) { // 로그인 성공
//			System.out.print("로그인 성공");
//		}else { // 아이디 또는 비밀번호 오류입니다.
//			System.out.print("아이디 또는 비밀번호 오류입니다.");
//		}
	}

}
