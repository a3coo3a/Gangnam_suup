package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

// hr계정으로 접속해 보자꾸나~
public class JDBCSelect01 {

	public static void main(String[] args) {
		// 1. 연결할 주소, 아이디, 비밀번호를 변수로 저장
		// db환경에 따라 변경될 수 있음. -> "jdbc:oracle:thin:@아이피주소:포트번호/스키마(접속할계정)"
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid = "hr";
		String upw = "hr";
		
		// 계속 바뀌어야 하는 값. 즉, 자바에서 전달해줄 값을 ?로 표현
		// ? 갯수에 따라 인덱스 번호를 부여해서 값을 전달하는데 1부터 시작함.
		String sql = "select employee_id, last_name, salary, hire_date from employees where employee_id = ?";
		
		
		// 2. java.sql패키지를 사용하게 되는데 해당클래스는 전부 throws 사용 -> try 구문에 사용
		Connection conn = null;   // 추후 close 하기 위해 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 3. 사용할 드라이버를 클래스 로더에 생성
			Class.forName("oracle.jdbc.driver.OracleDriver");		// 클래스를 준비시켜 놓는다고 생각하면됨.
			
			// 4. 연결 객체 생성 (Connection 객체)
			conn = DriverManager.getConnection(url, uid, upw);
			
			System.out.println(conn);
			// 결과 : oracle.jdbc.driver.T4CConnection@2805c96b
			// 실패시 null로 출력됨.
			
			// 5. SQL문 쿼리를 전달하기 위한 Statement 객체를 Connection에서 얻음
			// 		sql문을 주고 미리 준비시켜두는 것
			pstmt = conn.prepareStatement(sql);
			// 숫자값은 setInt(index,값)
			// 문자값은 setString(index,값) 을 통해 저장
			pstmt.setInt(1, 100);   // 이러면 ?대신 100으로 바뀌어서 들어감.   같은 의미 pstmt.setString(1,"100") 으로 작성해도 같은 결과를 얻을 수 있음.
			
			
			// 6. 실행
			// 5번에서 이미 sql문을 전달했기때문에 따로 전달하지 않아도됨. 두번전달시 에러 발생
			// 데이터를 가져와야 하는 select의 경우 executeQuery()
			// 데이터를 가져오지 않아도 되는 insert, update, delete의 경우는 executeUpdate()
			// executeUpdate() - 1or0을 통해 성공여부 확인 가능
			
			// 순서 없는 형태로 저장 : SET타입이기 때문에
			// pstmt.executeQuery(sql)로 작성시 set값이 되지 안은 상태로 초기화 되는 경우이다.
			rs = pstmt.executeQuery();   
			
			
			// 7. rs를 반복문으로 돌려서 결과를 처리
			// 		- rs의 next()메서드를 통해 다음 행을 조회하는 형식으로 처리 : set이다 보니 인덱스를 통한 순서 접근이 안됨.
			while(rs.next()) {		// rs.next() : 다음행에대한 검사 있으면 다음행으로의 이동까지 담당
				// select의 결과를하나씩 읽으려면 
				// 문자열 : getString(컬럼명)
				// 숫자 : getInt(컬럼명)
				// 날짜 : getTimestamp(컬럼명)
				int employee_id = rs.getInt("employee_id");   // String 타입으로 반환
				String last_name = rs.getString("last_name");
				int salary	= rs.getInt("salary");
				Timestamp hire_date = rs.getTimestamp("hire_date");  //시간까지
				
				System.out.println("사원아이디 : " + employee_id);
				System.out.println("이름 : " + last_name);
				System.out.println("급여 : " + salary);
				System.out.println("입사일 : " + hire_date);
				System.out.println();
				
			}// while end
			
			
			
			
			
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
