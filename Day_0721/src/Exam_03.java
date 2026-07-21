// 키보드로 학번, 이름, 국어, 영어, 수학 입력
/* 학생 객체(Student) 생성 후 출력
 * 
 */


public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 입력(학생 객체 생성)
		
		
		
		int hakbun = 1124;
		String name = "김형준";
		int kor = 97;
		int eng = 80;
		int mat = 70;
		
		
		//기본 생성자 사용시 
		Student st1 = new Student();
		st1.hakbun = hakbun;
		
		//초기화 생성자 사용시
		Student st2 = new Student(hakbun, name, kor, eng, mat);
		st2.totcarculate();
		st2.totalhakjum();
		// 총점, 평균을 구하여 다음과 같이 출력
		// 학번 이름 국어 영어 수학 총점 평균
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(hakbun + "\t" + name + "\t" + kor + "\t" +  eng + "\t" +  mat + "\t" + st2.tot + "\t" + st2.ave);
		
		
		// 학점을 구하여 출력(A,B,C,D,F)
		// 학번 이름 국어 영어 수학 총점 평균 학점
		
		
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println(hakbun + "\t" + name + "\t" + kor + "\t" +  eng + "\t" +  mat + "\t" + st2.tot + "\t" + st2.ave);



}

}
