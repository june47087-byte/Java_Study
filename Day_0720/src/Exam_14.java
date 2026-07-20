import java.util.Arrays;

class Chejo{
	String name;
	int[] score;
	int max,min;
	
	Chejo(String name, int[] score) {
		this.name = name;
		this.score = score;
	}
	
	void maxMin() {
		max = score[0];
		min = score[0];
		for(int i = 1; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
	}
	
	void dataPrint() {
		System.out.println("이름 : " + name);
		System.out.println("점수 : " + Arrays.toString(score));
		System.out.println("최대 점수 : " + max);
		System.out.println("최소 점수 : " + min);
	}
	
	
}
public class Exam_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chejo c = new Chejo("김학생", new int[] {9, 3, 8, 7, 6, 7, 5 ,6});
		c.maxMin();
		c.dataPrint();
		c = new Chejo("이학생", new int[] {1, 5, 2, 6, 7, 8, 6, 4, 7, 5});
		c.maxMin();
		c.dataPrint();
	
	}

}
