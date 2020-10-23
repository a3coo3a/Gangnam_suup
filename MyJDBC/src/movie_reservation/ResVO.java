package movie_reservation;

import java.sql.Timestamp;

public class ResVO {
	
	private int res_no;
	private int res_mem_no;
	private int res_movie_no; 
    private String res_name;
    private String res_movie_name;
    private String res_movietheater;
    private String res_regdate;
    private String res_seat;
    private String res_paymentYN;
	
	public ResVO() {
	}

	public ResVO(int res_no, int res_mem_no, int res_movie_no, String res_name, String res_movie_name,
			String res_movietheater, String res_regdate, String res_seat, String res_paymentYN) {
		super();
		this.res_no = res_no;
		this.res_mem_no = res_mem_no;
		this.res_movie_no = res_movie_no;
		this.res_name = res_name;
		this.res_movie_name = res_movie_name;
		this.res_movietheater = res_movietheater;
		this.res_regdate = res_regdate;
		this.res_seat = res_seat;
		this.res_paymentYN = res_paymentYN;
	}

	public int getRes_no() {
		return res_no;
	}

	public void setRes_no(int res_no) {
		this.res_no = res_no;
	}

	public int getRes_mem_no() {
		return res_mem_no;
	}

	public void setRes_mem_no(int res_mem_no) {
		this.res_mem_no = res_mem_no;
	}

	public int getRes_movie_no() {
		return res_movie_no;
	}

	public void setRes_movie_no(int res_movie_no) {
		this.res_movie_no = res_movie_no;
	}

	public String getRes_name() {
		return res_name;
	}

	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}

	public String getRes_movie_name() {
		return res_movie_name;
	}

	public void setRes_movie_name(String res_movie_name) {
		this.res_movie_name = res_movie_name;
	}

	public String getRes_movietheater() {
		return res_movietheater;
	}

	public void setRes_movietheater(String res_movietheater) {
		this.res_movietheater = res_movietheater;
	}

	public String getRes_regdate() {
		
		return res_regdate;
	}

	public void setRes_regdate(String res_regdate) {
		this.res_regdate = res_regdate;
	}

	public String getRes_seat() {
		return res_seat;
	}

	public void setRes_seat(String res_seat) {
		this.res_seat = res_seat;
	}

	public String getRes_paymentYN() {
		return res_paymentYN;
	}

	public void setRes_paymentYN(String res_paymentYN) {
		this.res_paymentYN = res_paymentYN;
	}
	
	
	
}
