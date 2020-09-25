package collection.list;

import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {

		// LinkedList
		// - list,queue 모두 사용 가능
		// - FIFO : First In First Out
		Queue<String> listQueue = new LinkedList<String>();

		listQueue.add("홍길동");
		listQueue.add("홍길자");

		System.out.println(listQueue.size());

		// peek() - 값을 꺼냄
		System.out.println(listQueue.peek()); // 먼저 집어넣은 홍길동이 먼저 나옴 //값을 꺼내기만 함. 출력의 기능
		System.out.println(listQueue.size());

		// poll() - 값을 꺼낸 후 삭제
		System.out.println(listQueue.poll()); // 값을 꺼내 보여주고 지움
		System.out.println(listQueue.size());

		// 리스트와 동일하게 동작
		List<String> listList = new LinkedList<>();

		// List, Queue 모두 사용 가능
		LinkedList<String> listLinked = new LinkedList<String>();

		listLinked.add("홍길동");
		listLinked.add("홍길자");
		listLinked.add("김길동");

		listLinked.addFirst("이순신"); // 처음에 추가
		listLinked.addLast("김유신"); // 마지막에 추가
		
		System.out.println(listLinked.toString());

	}

}
