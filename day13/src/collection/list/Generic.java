package collection.list;

import java.util.*;

public class Generic {
	// List<?> - 타입상관 없이 무엇이든 들어 갈 수 있음.
	// List<? extends String> - String의 자식 클래스는 전달가능.
	// List<? super Integer> - Integer의 형태를 가지고 있다면 전달가능.

	public static void add(List<?> list) {
		// 전부가능
	}
	public static void add2(List<? extends String> list) {
		// String 만가능
	}
	public static void add3(List<? super Integer> list) {
		// Integer, Object 가능
	}
	public static void main(String[] args) {
		List<String> listStr = new ArrayList<>();
		List<Integer> listInt = new ArrayList<>();
		List<Object> listObj = new ArrayList<>();
		
		//add(List<?> list)
		add(listStr);
		add(listInt);
		add(listObj);
		
		//add2(List<? extends String> list)
		add2(listStr);
		add2(listInt);	
		add2(listObj);
		
		//add3(List<? super Integer> list)
		add3(listStr);
		add3(listInt);
		add3(listObj);
		
		
		
		
	}
}
