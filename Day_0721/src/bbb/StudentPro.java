package bbb;
// 아래의 3줄이 싱글톤 만드는 방법이다. 이제 반환값이  student다
public class StudentPro {
	private StudentPro() {}
	
	public static StudentPro pro = new StudentPro();
	
	public static StudentPro getInstance() {
		return pro;
	}

	//필요한 메소드 만들기
	// 1. Student 객체를 생성 후 반환하는 메소드
	public Student getStudent(int hak, String name, boolean gender, int age, int kor, int eng, int mat) {
		
		Student Student = new Student(hak, name, gender, age, kor, eng, mat);
		
		return Student;
	}

	
	//2. 총점, 평균, 출력하는 메소드 
	public void studentOutput(Student stu1) {
		System.out.println("학번\t이름\t성별\t나이\t국어\t영어\t수학\t총점\t평균");
		
		String str = "여자";
		if(stu1.isGender()) {
			str = "남자";
		}
		
		int tot = stu1.getKor() + stu1.getEng() + stu1.getMat();
		double ave = (double)tot / 3.0; 
		System.out.print(stu1.getHak() + "\t" + stu1.getName() + "\t");
		System.out.print(stu1.getAge() + "\t" + str + "\t");
		System.out.print(stu1.getKor() + "\t" + stu1.getEng() + "\t");
		System.out.print(stu1.getMat() + "\t" + tot + "\t");
		System.out.printf("%.2f\n", ave);
	}
}
