// 학생 성적 처리하는 법 (번호, 이름, 국어, 영어, 수학, 총점, 평균)
class CC{
	int bun;
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double ave;
	
	CC(){}
	
	CC(int bun, String name, int kor, int eng, int mat){
		this.bun = bun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
//		totAve(); 이거는 일괄적으로 출력하기에 필요할때만 해야할때는 아래처럼 뺴놓고 따로따로 넣어줘야 한다.
//		CCPrint();
	}
	
	void totAve() {
		tot = kor + eng + mat;
		ave = tot/3.;
	}
	
	void CCPrint() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(tot + "\t");
		System.out.print(ave + "\t");
	}
}
public class Exam_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC c1 = new CC(); // 위험한 방식이다. 멤버 변수는 바깥에서 접근하면 안된다. 
		c1.bun = 1;
		c1.name = "김형준";
		c1.kor = 90;
		c1.eng = 88;
		c1.mat = 70;
		c1.totAve();
		c1.CCPrint();
		
		CC c2 =  new CC(2, "이학생", 97, 77, 55);
		c2.totAve();
		c2.CCPrint();
		
		
		
	}

}
