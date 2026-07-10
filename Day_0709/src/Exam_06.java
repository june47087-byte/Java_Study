
public class Exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 3.14567; // 3.15
		// 1. (3.14567 * 100) = > 314.567 = 0.5 = > 3.15067
		// 2. (int)(315.067) = 315, 315/100. => 3.15
		// 100만 바꾸면 자릿수를 바꿔서 반올림이 된다. 1000 하면 3.145가 될것이다. 틀렸다. 31.45가 나온다. 나중에 제미나이로 알아보자.
		a = (int)(a * 100 + 0.5) / 100.;
		System.out.println("a = " + a);
		
		double aa = 3.14567;
		System.out.println("aa = " + String.format("%f", aa));
		System.out.println("aa = " + String.format("%.2f", aa));
		System.out.println("aa = " + String.format("%7.2f", aa));
		//파이썬에서 배웠던 실수 앞에 몇칸 띄우고 뒤에 몇개만 나타내고 반올림하고 이런거이다. 
		
	}
	
}
