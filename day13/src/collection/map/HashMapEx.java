package collection.map;

import java.util.*;
import java.util.Map.Entry;


public class HashMapEx {

	public static void main(String[] args) {

		// HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();

		// put() - 값 저장
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");

		// size() - 크기
		System.out.println(map.size());
		System.out.println(map.toString());

		// 맵에 같은 key를 저장할 경우, key에 있는 value를 수정함
		map.put(4, "신사임당");
		System.out.println(map.toString());

		// get() - map에 저장된 value값 얻기
		String value = map.get(3);
		System.out.println("3번키의 내용  ? " + value);

		// containsKey() - map의 검색
		if(map.containsKey(1)) {	// key가 있으면 true, 없다면 false
			System.out.println("1번키 존재");	
		}
		
		// KeySet, EntrySet - map에 저장된 값을 순서대로 출력
		// KeySet		
		Set<Integer> keySet = map.keySet();		// 키만 뽑아서 셋으로 바꿔주는 역할
		System.out.println(keySet.toString());
		
		for (int a : keySet) {
			System.out.println(a);
		}
		
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			int key = iter.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		// EntrySet
		Set<Entry<Integer, String>> entry = map.entrySet();
		
		for (Entry<Integer, String> en : entry) {
			System.out.print(en.getKey() + " ");
			System.out.println(en.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
