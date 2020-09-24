package collection.list;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {

		// ArrayList객체 생성
		// ArrayList<String> list = new ArrayList<>();
		// Collection<String> list = new ArrayList<>();

		List<String> list = new ArrayList<>();

		// add() - list 값 추가
		list.add("JAVA");
		list.add("DataBase");
		list.add("JSP");
		list.add("SPRING");
		list.add("JAVA");

		// size() - list 크기 : 배열은 length, list는 size
		System.out.println("list의 크기 : " + list.size());

		// toString() - list의 저장된 객체를 문자열로 확인
		System.out.println(list.toString());
		
		// add(index, 값) - list의 중간에 추가
		list.add(2, "ORACLE");
		System.out.println(list.toString());
		
		// get(index) - list 값 얻기
		String value = list.get(2);
		System.out.println("2번 인덱스 값 : " + value);
		
		// contains(값) - list의 특정값 포함 여부
		System.out.println(list.contains("JSP"));		// 있다면 true
		System.out.println(list.contains("Hi"));		// 없다면 false
		
		// remove(값), remove(index) - list의 삭제
		list.remove(0);
		System.out.println(list.toString());
		list.remove("JSP");
		System.out.println(list.toString());
		
		// addAll(리스트);
		String[] arr = {"React", "AWS"};
		List<String> list2 = Arrays.asList(arr);	// 배열타입 -> 리스트타입 변환
		list.addAll(list2);		// list의 내용 뒤에 list2의 내용 전체를 추가하는 것!
		
		System.out.println(list.toString());
		
		
		
	}
}
