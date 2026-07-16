//석차 구하기
public class Exam_04 {

	public static void main(String[] args) {
		int score[] = {90, 60, 80, 70, 55, 88, 77, 65};
		int[] rank = new int[score.length];
		// 석차를 구하려면 아래 방식으로도 충분하다
		for(int i=0; i<score.length; i++) {
			rank[i] = 1;
		//	System.out.print(score[i] + " : ");
			for(int j = 0; j<score.length; j++) {
				if(score[i] < score[j]) {
					rank[i]++;
				}
			}
		//	System.out.println(rank[i]);
		}
		
		//한번에 출력
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i] + " : " + rank[i]);
		}
		System.out.print("\n");
		
		// 석차순으로 오름차순
		for(int i = 0; i < score.length - 1; i++) {
			for(int j = i + 1; j < score.length; j++) {
				if(score[i] < score[j]) {
					int imsi = score[i];
					score[i] = score[j];
					score[j] = imsi;
					
					imsi = rank[i];
					rank[i] = rank[j];
					rank[j] = imsi;
				}
			}
		}
		// 출력
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i] + " : " + rank[i]);
		}
		
	}

}
