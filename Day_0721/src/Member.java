
public class Member {
	// 멤버변수
	String name;
	String id;
	String pass;
	String phone;
	
	public Member() {}
	
	public Member(String name, String id, String pass, String phone) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.phone = phone;
	}
	//회원가입
	boolean memberRegister() {
		if(name != null && id != null && pass != null && phone != null ) {
			return true;
		}else {
			return false;
		}
		
	}
	// 로그인
	boolean memberLogin(String id, String pass) {
		if(id.equals(this.id) && pass.equals(this.pass)) {
			return true;
		}else {
			return false;
		}
	}
	// 로그아웃
	String memberLogout() {
		// 이름 아이디 비번 전화 삭제를 넣어버리면 회원탈퇴이긴하지마 어쨋든 로그아웃 세션 안 배워서 이렇게 밖에 못함
		
		return "로그아웃 되었습니다";
	}
}
