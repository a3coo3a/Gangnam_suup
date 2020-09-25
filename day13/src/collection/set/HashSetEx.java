package collection.set;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {

		// set계열은 순서 x , 중복 x
		//HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		// add() - 추가
		set.add("JAVA");
		set.add("JSP");
		set.add("SPRING");
		set.add("ORACLE");
		set.add("JAVA");	// 중복
		
		// size() - set에 저장된 크기
		System.out.println(set.size());
		System.out.println(set.toString());
		
		// set에 저장된 객체를 확인하려면,
		// 반복자(iterator)를 통해 한번씩 확인합니다.
		Iterator<String> iter = set.iterator();	// set을 반복자타입으로 변경
		
		while (iter.hasNext()) {		// 다음이 있는지 있으면 true, 없으면 false
			System.out.println(iter.next());
		}
		
		// set 검색
		if(set.contains("JSP")) {
			System.out.println("JSP 가 포함되어 있음.");
		}
		
		// set 삭제
		set.remove("JAVA");
		System.out.println(set.toString());
		
		
		
	}

}
