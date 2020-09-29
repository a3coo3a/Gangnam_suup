package ramda.stream;

import java.util.*;

public class MainClass01 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("홍길동");
		list.add("이순신");
		list.add("박찬호");
		list.add("김유신");
		list.add("홍길자");

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();

		/* 익명객체 방법 */
		// Stream<String> stream = list.stream(); // 컬렉션 -> 스트림
		// stream.forEach(new Consumer<String>() {
		//
		// @Override
		// public void accept(String t) {
		// System.out.println(t);
		//
		// }
		// });
		
		/* 람다식 방법 */
		// - foreach 메서드는 최종처리 메서드이고, 람다식의 표현으로 쓸 수 있습니다.
		list.stream().forEach((t) -> System.out.println(t));

	}
}
