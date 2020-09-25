package collection.set;

import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {

		// set과 동일하고, 자동으로 오름차순 정렬
		// - 문자일시 사전 검색 순서로 정렬
		// - 중복을 허용하지 않음.
		TreeSet<Integer> set = new TreeSet<>();

		set.add(100);
		set.add(100);
		set.add(50);
		set.add(1);
		set.add(23);
		set.add(57);

		System.out.println(set.toString());

		TreeSet<String> set2 = new TreeSet<String>();

		set2.add("강아지");
		set2.add("강아지");
		set2.add("고양이");
		set2.add("송아지");
		set2.add("병아리");
		set2.add("얼룩소");
	
		System.out.println(set2.toString());
	
	}

}
