package quiz24;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 맵을 이용하는데 key:메뉴이름, value : 가격
		Map<String, String> map = new HashMap<>();

		end: while (true) {
			System.out.println("------ 메뉴 관리 -----");
			System.out.println("1. 신규 메뉴 등록"); // 이미 등록된 메뉴인지 확인 후 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); // 메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); // 변경할 메뉴를 받아서 메뉴가 있다면 가격 수정
			System.out.println("4. 메뉴판 삭제"); // 변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); // 종료
			System.out.println("-------------------");
			System.out.print("메뉴 입력 > ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				System.out.print("메뉴명 > ");
				String name = sc.nextLine();
				
				if (map.containsKey(name)) {
					System.out.println("이미 등록되어 있는 메뉴입니다.");
				} else {
					System.out.print("가격 > ");
					String price = sc.nextLine();
					map.put(name, price);
					System.out.println(map.size());
				}
				
				break;
			case 2:
				if (map.size() == 0) {
					System.out.println("등록된 메뉴가 없습니다.");
				} else {
					Set<Entry<String, String>> entry = map.entrySet();
					for (Entry<String, String> en : entry) {
						System.out.println("* "+en.getKey() + " : " + en.getValue() + "원");
					}
				}
				break;
			case 3: // 메뉴판 가격 수정
				if (map.size() == 0) {
					System.out.println("등록된 메뉴가 없습니다.");
				} else {
					System.out.print("수정할 메뉴 > ");
					String chName = sc.nextLine();
					if (map.containsKey(chName)) {
						System.out.print("수정할 가격 > ");
						String chPrice = sc.nextLine();
						map.put(chName, chPrice);
					} else {
						System.out.println(chName + "은 메뉴에 없습니다.");
					}
				}
				break;
			case 4: // 메뉴판 삭제
				if (map.size() == 0) {
					System.out.println("등록된 메뉴가 없습니다.");
				} else {
					System.out.print("삭제할 메뉴 > ");
					String delName = sc.nextLine();
					if (map.containsKey(delName)) {
						System.out.println(delName + "(이)가 삭제되었습니다.");
						map.remove(delName);
					} else {
						System.out.println("삭제할 메뉴가 없습니다.");
					}
				}
				break;
			case 5:
				System.out.println("종료합니다.");
				break end;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}// switch end

		} // while end
		sc.close();

	}
}
