package quiz24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuiz01 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("kim1234", "kkk1234");
		map.put("lee5678", "lll1234");
		map.put("par4321", "ppp4321");

		/*
		 * 1. id와 pw를 입력받아서 해당 아이디가 map에 존재하는지 확인합니다.
		 * 2. 존재하면 다시한번 비밀번호 값과 비교해서, 비밀번호도 일치하면 "로그인 성공" 콘솔에 출력
		 * 비밀번호가 다르다면 "비밀번호가 틀렸습니다"를 출력하세요
		 * 3. id가 맵에 존재하지 않으면 "아이디가 없습니다."를 출력
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("id 입력 > ");
			String id = sc.nextLine();
			System.out.print("pw 입력 > ");
			String pw = sc.nextLine();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {		// 단순히pw를 찾는게 아니라 id에 매칭되어 있는 pw를 찾는게 Point!
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("아이디가 없습니다.");
			}
		}

		sc.close();
	}
}
