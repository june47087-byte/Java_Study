
public class Exam_07 {
	// 1 ~ 10 까지 정수 출력하는 메소드
	static void add() {
		int s = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
			s += i;
		}
		System.out.print("=" + s);
	}
	// 1 ~ N 까지 정수 출력하는 메소드
		static void addN(int n) {
			int s = 0;
			for(int i = 1; i <= n; i++) {
				System.out.print(i + " ");
				s += i;
			}
			System.out.print("=" + s);
		}
		
		static int addSum(int n) {
			int s = 0;
			for(int i = 0; i < n; i++)
				s += i;
				return s;
		}
	public static void main(String[] args) {
		add(); // 알아서 1~10까지의 합계가 나온다.
		
		System.out.print("\n"); 
		addN(5); // 알아서 1~ N까지의 합계가 나온다.
		addSum(100); // 5050
		System.out.println("1 ~ 10 합 : " + addSum(20));
		
	}
}
