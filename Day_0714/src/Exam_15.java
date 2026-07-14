// 배열의 공유와 복제
// 통장과 카드 같은거다 
public class Exam_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 50};
		
		int brr[] = arr; // 배열 공유
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("brr[0] = " + brr[0]);
		
		brr[1] = 20000;
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("brr[1] = " + brr[1]);
	}

}
