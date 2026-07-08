// 표준 입력 : System.in.read()
// System(클래스)in.(속성).read(메소드,함수)
public class Exam_04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("문자를 입력하세요 : ");
		System.out.println("입력된 글자는 " + System.in.read());
		System.out.println("입력된 글자는 " + System.in.read());
		System.out.println("입력된 글자는 " + System.in.read());
//		여러글자를 입력하면 read 여러번 써라 (char)System.in.read()하면 문자로 입력하면 그대로 나온다.
	}

}
