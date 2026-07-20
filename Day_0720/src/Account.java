
public class Account {
	// 배열의 전체 합계를 출력
	void dataTotal(int[] arr) {
		int sum = 0;
		System.out.print("Data : ");
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i]);
			if(i == arr.length - 1) {
				System.out.print("=");
			}else {
				System.out.print("+");
			}
		}
		System.out.println(sum);
	}	
	// 배열의 평균 이상 점수를 구하여 출력하는 메소드
	// Data : 30 67 55 79 97 65 33 78 98 58 94 32
	//평균(65.33)이상 : 67 79 78 96 94
	void dataAverage(int[] arr) {
		int sum = 0;
		System.out.print("Data : ");
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.printf("%3d", arr[i]);
		}
		System.out.print("\n");
		double ave = (double)sum/arr.length;
		System.out.printf("평균(%.2f)이상 :", ave);
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] >= ave) {
				System.out.printf("%4d", arr[j]);
			}
		}
		System.out.print("\n");
	}
	// 오름차순 정렬 메소드
	// Data : 30 67 55 79 97 65 33 78 98 58 94 32
	// Sort : 30 32 33 55 58 65 67 78 79 94 96 97
	void arrSort(int[] arr) {
		int[] a = arr.clone();
		
		for(int i = 0; i < a.length - 1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(arr[i] < arr[j]) {
					int imsi = a[j];
					a[i] = a[j];
					a[i] = imsi;
				}
			}
		}
		System.out.print("Data : ");
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%4d", arr[i]);
		}
		System.out.print("\n");
		System.out.print("sort :");
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.print("\n");
	}
	//배열 요소중 최대값을 반환하는 메소드
	int datamax(int arr[]) {
		int max = arr[0];
		System.out.print("Data : ");
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%4d", arr[i]);
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print("\n");
		return max;
	}
}
