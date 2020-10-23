package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("id>");
		String id = sc.next();
		System.out.print("pw>");
		String pw = sc.next();
		System.out.print("name>");
		String name = sc.next();
		System.out.print("email>");
		String email = sc.next();
				
		
		// 1. 필요한 변수 선언
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "user01";
		String upw = "user01";
		
		// 2. insert, update, delete
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into member(id, pw, name, email) values(?, ?,?,?)";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection(url,uid,upw);
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, id);
			pstmt.setNString(2, pw);
			pstmt.setNString(3, name );
			pstmt.setNString(4, email);
			
			int result = pstmt.executeUpdate();	// 성공시 1, 실패시 0
			
			if(result == 1) {
				System.out.println("DB입력 성공");
			}else {
				System.out.println("DB입력 실패");
			}
			
			
			// commit까지 자동으로 이루어짐.
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	}

}
