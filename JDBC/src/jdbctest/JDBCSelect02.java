package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
/*
 * db에 테이블
 * create table member(
 * id VARCHAR2(30) PRIMARY key,
 * pw VARCHAR2(30),
 * name VARCHAR2(30),
 * email VARCHAR2(30)
 * );
 * 
 * insert into member values('test01', '1234', '홍길동', 'naver');
 * insert into member values('test02', '1234', '이순신', 'ever');
 * insert into member values('test03', '1234', '홍길자', 'google');
 * 
 * commit;
 * 
 */

public class JDBCSelect02 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "user01";
		String upw = "user01";

		String sql = "select * from member where name = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection(url, uid, upw);

			System.out.println(conn); // 접속확인

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "홍길자");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");

				System.out.println("아이디 : " + id);
				System.out.println("비밀번호 : " + pw);
				System.out.println("이름 : " + name);
				System.out.println("이메일 : " + email);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}// main end
}// class end
