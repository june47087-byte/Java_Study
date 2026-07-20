// 생성자 : 객체 생성시 호출되는 메소드
// 클래스 이름과 동일한 메소드. 생
class EE{
	int a;
	String n;
	

	/*EE(){
		이것이 생성되어 있는거다.
	*/
}
public class Exam_09 {
	public static void main(String[] args) {
		EE e1 = new EE( ); 
		// 메소드를 호출하는건데 메소드가 없다 도대체 어디서 온걸까?생성자로 호출할 메소드가 없다면 메소드가  만들어진거다.
		// 주의점 디폴트 생성자를 만든 뒤에 class에서 메소드를 만들면 생성자를 인정하지 않는다.
		e1.a = 1;
		e1.n = "AAA";
		EE e2 = new EE();	
		e2.a =3;
		e2.n = "ssss";
		
	}
}
