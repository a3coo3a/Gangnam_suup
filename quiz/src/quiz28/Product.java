package quiz28;

public class Product {
	//day, store, grade, detail,price
	private String day;
	private String store;
	private String grade;
	private String detail;
	private String price;
	
	public Product(String[] arr) {
		day = arr[0];
		store = arr[1];
		grade = arr[2];
		detail = arr[3];
		price = arr[4];
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [day=" + day + ", store=" + store + ", grade=" + grade + ", detail=" + detail + ", price="
				+ price + "]";
	}
	
	
	
	
}
