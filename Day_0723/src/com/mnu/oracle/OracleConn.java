package com.mnu.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConn {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. JDBC 드라이브 로딩 --  오라클 사이트에서 다운(ojdbc8.jar)
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 드라이버 로딩
			System.out.println("오라클 드라이버 로딩 성공");
		}catch(Exception e) {
			System.out.println("드라이버 로딩 실패");
		}
		// 2. Connection 자바와 오라클 사이의 다리를 놓는 것.
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##TEST", "1234");
			System.out.println("Connection : " + conn);
			System.out.println("커넥션 연결 성공");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP WHERE DNO=10 ORDER BY SALARY DESC");
			while(rs.next()) { //rs.next()는 rs에 데엍가 담기고 데이터 테이블 한칸씩 내려가라임 그러니 마지막이 되면 자동 종료임
				System.out.print(rs.getInt("eno") + "\t");
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("job") + "\t");
				System.out.print(rs.getInt("manager") + "\t");
				System.out.print(rs.getString("hiredate") + "\t");
				System.out.print(rs.getInt("salary") + "\t");
				System.out.print(rs.getInt("commission") + "\t");
				System.out.print(rs.getInt("dno") + "\n");
				
			}
		}catch(Exception e) {
			System.out.println("커넥션 연결 실패");
		}
		// 3. SQL 명령 수행
		
		// 4. 종료
	}

}
