package quiz21;

import java.util.*;

public class ArrayListQuiz02 {
	public static void main(String[] args) {

		// 1. User클래스는 은닉된 변수로 name, age를 선언하고 생성
		// 2. User클래스를 저장할 수 있는 List생성 선언
		// 3. User객체 2개를 생성해서 리스트에 추가하세요
		// 4. list에 저장된 모든 name, age를 반복문으로 출력
		// 5. list에 홍길자가 있다면 홍길자의 이름, 나이만 출력
		// 6. list에 홍길동이 있다면 홍길도User객체 삭제

		User u1 = new User("홍길동", 10);

		List<User> list = new ArrayList<>();

		list.add(u1);
		list.add(new User("홍길자", 20));

		// 향상된 포문도 가능
		for (int i = 0; i < list.size(); i++) {
			System.out.println("*** [" + (i + 1) + "] 정보 ***");
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("나이 : " + list.get(i).getAge());
		}
		System.out.println();
		// foreach
		for(User u : list) {
			System.out.println("이름 : " + u.getName()+", 나이 : " + u.getAge());
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			if ("홍길자".equals(list.get(i).getName())) {
				System.out.println("*** 찾는 정보 ***");
				System.out.println("이름 : " + list.get(i).getName());
				System.out.println("나이 : " + list.get(i).getAge());
				System.out.println();
			}
		}

		// 삭제는 향상된for문사용시 당겨져오는 문제가 있을수 있어 일반 포문 사용
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().contains("홍길동")) {
				System.out.println(list.get(i).getName() + "님의 정보가 삭제되었습니다.....ㅜ.ㅜ");
				list.remove(i);
				System.out.println();
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println("*** [" + (i + 1) + "] 정보 ***");
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("나이 : " + list.get(i).getAge());
			System.out.println();
		}

	}
}
