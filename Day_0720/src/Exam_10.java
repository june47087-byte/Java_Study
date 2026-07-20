class Student{
	int bun;
	String name;
	int age;
	
	Student(){}
	
	Student(int bun) {
		
	}
	Student(int bun, String name) {
		
	}
	Student(int bun, String name, int age) { // 메소드 오버로딩
		
	}
	
	
	void studentPrints() {
		System.out.println("번호 : " + bun);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}
public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.bun = 1;
		s1.name = "김학생";
		s1.age = 20;
		s1.studentPrints();
		Student s2 = new Student();
		s2.studentPrints();
		s2.bun = 1;
		s2.name = "김학생";
		s2.age = 20;
		Student s3 = new Student();
		s3.studentPrints();
		s3.bun = 1;
		s3.name = "김학생";
		s3.age = 20;
	}

}
