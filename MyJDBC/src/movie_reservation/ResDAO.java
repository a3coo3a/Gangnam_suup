package movie_reservation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Scanner;

public class ResDAO implements InterReservation {
	private final String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private final String uid = "user01";
	private final String upw = "user01";

	Scanner sc = new Scanner(System.in);
	public ResDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insertRes(ResVO vo) {
		int result = 0;

		Connection conn = null;
		PreparedStatement pstmt = null;

		String sql = "insert into movie_reservation " 
				+ "values(movie_res_seq.nextval,?,?,?,?,?,to_date(?),?,?)";
		try {

			conn = DriverManager.getConnection(url, uid, upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getRes_mem_no());
			pstmt.setInt(2, vo.getRes_movie_no());
			pstmt.setString(3, vo.getRes_name());
			pstmt.setString(4, vo.getRes_movie_name());
			pstmt.setString(5, vo.getRes_movietheater());
			pstmt.setString(6, vo.getRes_regdate());
			pstmt.setString(7, vo.getRes_seat());
			pstmt.setString(8, vo.getRes_paymentYN());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		return result;
	}

	@Override
	public int updateRes(ResVO vo) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql;
		try {
			conn = DriverManager.getConnection(url,uid,upw);
		while (true) {
			System.out.print("[1.좌석변경, 2.시간변경]");
			int select = sc.nextInt();
			sql = null;
			if (select == 1) {
				System.out.print("변경할 좌석을 입력하세요 > ");
				vo.setRes_seat(sc.nextLine());
				sql = "update movie_reservation set res_seat = ? where res_no = ?";
				pstmt = conn.prepareStatement(sql);
				result = pstmt.executeUpdate();
				pstmt.setString(1, vo.getRes_seat());
				pstmt.setInt(2, vo.getRes_no());
				break;
			} else if (select == 2) {
				System.out.print("변경할 시간을 입력하세요 > ");
				vo.setRes_regdate(sc.nextLine());
				sql = "update movie_reservation set res_regdate = to_date(?) where res_no = ?";
				pstmt = conn.prepareStatement(sql);
				result = pstmt.executeUpdate();
				pstmt.setString(1, vo.getRes_regdate());
				pstmt.setInt(2, vo.getRes_no());
				break;
			} else {
				System.out.println("잘못입력하였습니다.");
			} 
			result = pstmt.executeUpdate();
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		return result;
	}

	@Override
	public int deleteRes(ResVO vo) {
		int result = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from movie_reservation where res_no=?";
		try {
			conn = DriverManager.getConnection(url, uid, upw);
			System.out.print("삭제할 번호 입력 > ");
			vo.setRes_no(sc.nextInt());
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getRes_no());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void selectRes(ResVO vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "";
		try {
			conn = DriverManager.getConnection(url,uid,upw);
			pstmt = conn.prepareStatement(sql);
			pstmt.
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
