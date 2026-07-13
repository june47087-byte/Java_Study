//1 ~10
public class Exam_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 ~ 10 정수 출력 후 합계
		// 1 2 3 4  10 = 55
		// 1. for()
		int sum = 0; // 합계
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%3d", i);
			sum += i;
			
		}
		System.out.printf(" = %3d\n", sum);
		
		// 간단한건for()보다 while()이 더 낫다.
		// 조건식들이 어떻게 바뀌는지 파악해보자.
		
		//while()문
		int j = 0;
		int tot = 0;
		while(j <=	 10) {
			j++;
			System.out.printf("%3d", j);
			/* 위치에 따라 결과값이 다르다 
			System.out.printf("%3d", j);
			i++;
			*/
			tot += j;
		}
		System.out.printf(" = %3d\n", tot);
	}

}
