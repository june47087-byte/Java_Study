
public class Exam_09 {
	//선택정렬 메소드
	static void sort(int[] arr, boolean flag) {
		if(flag) {// 오름차순
			for(int i = 0; i < arr.length - 1; i++) {
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						int imsi = arr[i];
						arr[i] = arr[j];
						arr[j] = imsi;
					}		
				}
			}
		}else {// 내림차순
			for(int i = 0; i < arr.length - 1; i++) {
				for(int j = i + 1; j < arr.length; j++) {
					if(arr[i] < arr[j]) {
						int imsi = arr[i];
						arr[i] = arr[j];
						arr[j] = imsi;
					}		
				}
			}	
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,4,5,3,2,4,5,6};
		sort(a, true);

	}

}
