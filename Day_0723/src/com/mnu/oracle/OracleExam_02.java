package com.mnu.oracle;
import java.sql.*;
public class OracleExam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 참조변수들이다. conn stmt rs
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 2. 커넥션 연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##TEST", "1234");
			// 3. 명령문 수행
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT ENO, ENAME, HIREDATE, SALARY FROM EMP WHERE DNO=10 ORDER BY SALARY DESC");
			// 4. 결과 출력
			while(rs.next()) {
				System.out.print(rs.getInt("eno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("hiredate") + "\t");
				System.out.print(rs.getInt("salary") + "\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
