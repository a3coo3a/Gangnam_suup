package quiz16;

public class Rect extends Shape{
	/*
	 * 사각형은 side변수를 가지고, 
	 * 생성될때 이름과 변의 길이를 받아서 생성됩니다.
	 * getArea()는 사각형의 넓이를 계산하도록 처리합니다.
	 * 
	 */
	private int side;

	public Rect(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public double getArea() {
		return side*side;
	}
	
	
	
	
	
}
