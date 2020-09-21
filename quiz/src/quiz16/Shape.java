package quiz16;

public abstract class Shape {

		private String name;
		// 생성자
		public Shape(String name) {
			this.name = name;
		}
		
		// 오버라이딩을 강제화 한다면 -> 추상 메서드
		public abstract double getArea();		// 도형마다 넓이를 구하는 메서드	
		
		// 오버라이딩을 강제화 하지 않는다면 -> 일반 메서드
		public String getName() {
			return "도형 이름 : " + name;
		}
}
