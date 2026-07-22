public class SawonDAO {
	private SawonDAO() {}
	
	public static SawonDAO instance = new SawonDAO();
	
	public static SawonDAO getInstance() {
		return instance;
	}

	
	//1. 메소드 생성(객체 생성 후 반환)
	public Sawon getSawon(int sabun, String name, int gender, int grade, int time) {
		
			Sawon Sawon = new Sawon(sabun, name, gender, grade, time);
		
			return Sawon;
	}
	
	// 2. 성별을 구하여 반환하는 메소드
	
	// 3. 주간 급여 계산 후 반환하는 메소드
	public int weekpayProcess(Sawon sa, int weekPay) {
		int pay = 0;// 주간급여
		int overTime = 0;// 초과근무시간
		int baseTime = sa.getTime(); // 45
		if(baseTime > 50) {
			baseTime = 50;
		}
		
		//초과근무시간
		if(baseTime > 36) {
			overTime = baseTime - 36;
			baseTime = 36;
		}
		// 1) 등급에 따른 시급 결정
		pay = (int) (baseTime * weekPay + (overTime * weekPay * 1.5));
		
		// 2) 최대 근무 시간 50시간 제한 적용
//		if(workTime > 50) {
//			workTime = 50; 
//		}
//		
		// 3) 주간 급여 계산 로직 (초과 근무 수당 포함)
//		if(workTime > 36) {
//			int normalPay = 36 * hourlyRate; // 36시간 기본급
//			int overtimePay = (int)((workTime - 36) * (hourlyRate * 1.5)); // 초과수당
//			pay = normalPay + overtimePay;
//		} else {
//			pay = workTime * hourlyRate; // 초과 안 한 경우
//		}
		
		// 4) 최종 계산된 급여 뱉어내기
		return pay;
		
	}
	
	
}
