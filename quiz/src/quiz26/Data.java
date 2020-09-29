package quiz26;

public class Data {
	
	private String city;//0
	private String area;//1
	private String year;//2
	private String month;//3
	private String price;//4
	
	public Data(){}
	
	public Data(String city, String area, String year, String month, String price) {
		super();
		this.city = city;
		this.area = area;
		this.year = year;
		this.month = month;
		this.price = price;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Data [city=" + city + ", area=" + area + ", year=" + year + ", month=" + month + ", price=" + price
				+ "]";
	}

	
}
