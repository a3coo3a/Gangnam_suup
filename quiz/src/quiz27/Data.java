package quiz27;

import java.util.Arrays;

public class Data {
	private String[] date = new String[10];
	public Data() {
		// TODO Auto-generated constructor stub
	}
	public Data(String[] date) {
		super();
		this.date = date;
	}
	public String[] getDate() {
		return date;
	}
	public void setDate(String[] date) {
		this.date = date;
	}
	@Override
	public String toString() {
		
		return Arrays.toString(date) ;
	}
	
}
