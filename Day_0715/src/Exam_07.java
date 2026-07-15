
public class Exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 2, 3},{4, 5, 6}}; // 2행 3열이 완성된다. {{n}, {n}, {n}} 이러면 3행 n열이 완성되는듯
		//가변 배율이라해서 3행인데 1행은 2칸 2행은 4칸 3행은 1칸 이런게 가능하다.ex : {{1,2}, {24,5,6,7}, {8}}
		//출력(기본 for())
		System.out.println("기본 for()");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}
		
		System.out.println("확장 for()"); // 좀 더 공부해보자.
		for(int[] a: arr) { // 줄수이다.
			for(int aa : a) {
				System.out.printf("%3d", aa);
			}
			System.out.print("\n");

		}
		
	}

}
