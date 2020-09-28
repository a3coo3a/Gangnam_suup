package ramda.basic;

public class MainClass {
	public static void main(String[] args) {
		// 1. say01인터페이스를 구현하는 클래스를 만들고 실행

		// 2. 익명객체 사용 방법
		Person p = new Person();
		p.greating(new Say01() {
			public void talking() {
				System.out.println("한국말 : 안녕");
			}
		});

		// 3. 람다식 사용방법
		p.greating(() -> {
			System.out.println("영어 : Hello");
		});

		System.out.println("----------------------------------------------");

		// 매개변수가 있는 유형
		// 익명함수
		p.greation(new Say02() {

			@Override
			public void talking(String word) {
				System.out.println(word);
			}
		});
		
		// 람다식
		p.greation((word) -> {System.out.println(word);});
		
		System.out.println("----------------------------------------------");
		
		// 반환유형이 있는 유형
		// 익명함수
		// greating의 반환유형 : Say03타입   // talking의 반환유형 : String
		p.greating(new Say03() {
			public String talking() {
				System.out.println("머여");
				return "finish";
			}
		}).greating(()->{
			System.out.println("또 머여");
			return "finish";});		// 또! .을 찍으면!!!! Person의 형식으로 메서드를 불러올 수 있다.
		
		// 람다식
		p.greating(()->{
			System.out.println("why!");
			return "finish";});
	}
}
