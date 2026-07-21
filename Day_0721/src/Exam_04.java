class AA{
	static int a =100;
	int b = 200;
}
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a1 = new AA();
		System.out.println("a = " + a1.a);
		System.out.println("a = " + a1.b);

		System.out.println("a = " + AA.a);
		
		AA a2 = new AA();
	}

}
