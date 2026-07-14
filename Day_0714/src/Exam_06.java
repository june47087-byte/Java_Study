//배열은 []을 사용한다 [] 하나면 1차원 배열 [][]2개 연속으로 나오면 2차원 배열 이런식으로 3차원 4차원으로 늘어간다.
public class Exam_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언 법
		int arr[]; //int [] arr;도 동일하다.
		
		//공간 할당 
		arr = new int[5]; // new가 있어야 자동 초기화가 된다. // 5이지만 0~4이기에 5는 에러다.
		System.out.println("arr :" + arr);
		System.out.println("arr[0] :" + arr[0]);
		System.out.println("arr[1] :" + arr[1]);
//		System.out.println("arr[5] :" + arr[5]);
//		arr = 10; 은 불가
		arr[0] = 10; //은 가능
		// 배열의 선언과 메모리 할당을 동시에
		int var[] = new int[5];
		
	}

}
