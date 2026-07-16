//가변인자를 이용하여 n개의 자료중에서 최대값을 구하여 반환하는 메소드
public class Exam_11 {
	static int scoreMax(int ... a) {
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = scoreMax(1, 2);
		System.out.println("max = " + max);
		
		System.out.println("max = " + scoreMax(4,3,1,2,4,5,5));
		
		int a[] = {1,2,3,4,5,6,6};
		System.out.println("max = " + scoreMax(a));
		// 이 방식은 배열을 일회성으로 이용할 때 사용한다.
		System.out.println("max = " + scoreMax(new int[] {5,3,1,12,3,4,5,6,6})); 
	}

}
