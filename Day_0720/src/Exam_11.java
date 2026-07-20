class Person{
	int num;
	String name;
	int age;
	
	Person(){
		this(6, "최", 31);// 자기가 자신의 생성자를 호출가능하다는 의미다. 이런 용도의 this는 처음에 딱 한번만 사용 가능
	}
	
	Person(int num, String name, int age) { // this는 자기 자신을 의미하는 키워드다. 아래처럼 헷갈릴때 멤버 변수인지 표기해주는것
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	void personPrint() {
		int num = 50;
		System.out.println("번호 : " + num);
		System.out.println("번호 : " + this.num);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
public class Exam_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(1, "김", 33);
		Person p2 = new Person(2, "이", 35);
		Person p3 = new Person(3, "박", 39);
		p1.personPrint();
		
	}

}
