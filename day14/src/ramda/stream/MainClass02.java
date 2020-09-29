package ramda.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {
		// stream 중간처리

		Random r = new Random();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(r.nextInt(100) + 1);
		}
		System.out.println("처음 : " + list.toString());
		System.out.println("\ndistinct()-------------------------------------------------");

		// distinct() : 중복제거, stream의 중간처리 메서드는 처리 결과를 다시 stream타입으로 반환됩니다.
		list.stream().distinct().forEach((s) -> System.out.print(s + " "));

		System.out.println("\n\nsorted()---------------------------------");

		// sort() : 정렬
		list.stream().distinct().sorted().forEach((s) -> System.out.print(s + " "));
		System.out.println("\n\nfilter()---------------------------------");

		// filter() : 필터링
		// list.stream().distinct().sorted().filter(new Predicate<Integer>() {
		//
		// @Override
		// public boolean test(Integer t) {
		// // TODO Auto-generated method stub
		// return false;
		// }
		// }); // 처음 사용하는 함수의 경우 람다식에 어떤게 들어가야 할지 모르므로익명객체를 띄워 확인하는 것도 방법
		list.stream().distinct().sorted().filter((t) -> {
			return t % 2 == 0; // false면 없애고 true만 살려
		}).forEach((s) -> System.out.print(s + " "));
		System.out.println("\n\nmap()---------------------------------");

		// map() : 람다안에 정의된 새로운 stream타입으로 반환
		// 익명식
		// list.stream().distinct().sorted().map(new Function<Integer, String>() {
		//
		// @Override
		// public String apply(Integer t) {
		//
		// return t % 2 == 0 ? "짝수" : "홀수";
		// }
		// }).forEach((s) -> System.out.print(s + " "));

		// 람다식
		list.stream().distinct().sorted().map((t) -> t % 2 == 0 ? t + "짝수" : t + "홀수")
				.forEach((s) -> System.out.print(s + " "));

		System.out.println("\n\nlist()---------------------------------");
		// 최종처리
		// collect() : 스트림의 처리된 결과를 list로 반환
		// - 최종적으로 반환받을 형식을 적어주면 됨 toList, toSet, toMap....
		List<Integer> result = list.stream().distinct().sorted().filter((t) -> t % 3 == 0).collect(Collectors.toList());
		System.out.println(result.toString());
		
		// max() : 큰값 찾기
		Integer max = list.stream().distinct().sorted().max(Integer::max).get();
		
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
