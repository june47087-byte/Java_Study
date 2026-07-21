package aaa;

public class Exam_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		// p.ssn = 111;
		p.setSsn("1234567");
		p.setName("김사람");
		p.setGender(true);
		p.setAge(30);
		
		System.out.println("주민번호 : " + p.getSsn());
		System.out.println("이름 : " + p.getName());
		System.out.print("성별 : ");
		if(p.isGender() == true) {
			System.out.print("남성" + "\n");
		}else {
			System.out.print("여성" + "\n");
		}
		System.out.println("나이 : " + p.getAge());
	}

}
