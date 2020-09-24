package quiz21;

import java.util.*;

public class ArrayListQuiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<>();

		end: while (true) {

			System.out.println("[1.등록 | 2.회원정보보기 | 3.회원정보검색 | 4.회원정보삭제 | 5.종료]");
			System.out.print("메뉴입력> ");
			int menu = sc.nextInt();
			sc.nextLine();		// 엔터제거

			if (menu == 1) {
				// 스캐너로 이름, 나이를 받고 User객체에 저장, list에 추가
				User u = new User();
				System.out.print("이름 > ");
				u.setName(sc.next());		
				System.out.print("나이 > ");
				u.setAge(sc.nextInt());
				sc.nextLine();
				list.add(u);

			} else if (menu == 2) {
				// list길이만큼 회전하면서 모든 회원정보 출력
				if(list.size() == 0) {
					System.out.println("목록이 없습니다. 회원정보를 등록하세요");
					continue;
				}
				for (User u : list) {
					System.out.println("이름 : " + u.getName() + ", 나이 : " + u.getAge());
				}

			} else if (menu == 3) {
				// 찾을 이름을 입력받고, 이름이 있다면 이름, 나이를 출력합니다.
				// 찾을 이름이 없으면 ~~님은 목록에 없습니다를 출력
				if(list.size() == 0) {
					System.out.println("목록이 없습니다. 회원정보를 등록하세요");
					continue;
				}
				System.out.print("찾을 이름 입력 > ");
				String name = sc.nextLine();
				boolean ch = false;
				for (User u : list) {
					if (u.getName().contains(name)) {
						System.out.println("이름 : " + u.getName() + ", 나이 : " + u.getAge());
						ch = true;
					}
				}
				if (!ch) {
					System.out.println(name + "님은 목록에 없습니다");
				}

			} else if (menu == 4) {
				// 찾을 이름을 입력받고, 이름이 있다면 User삭제
				if(list.size() == 0) {
					System.out.println("목록이 없습니다. 회원정보를 등록하세요");
					continue;
				}
				System.out.print("찾을 이름 입력 > ");
				String name = sc.nextLine();
				boolean ch = false;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						System.out.println(list.get(i).getName() + "님의 정보가 삭제되었습니다.");
						list.remove(i);
						ch = true;
					}
				}
				if(!ch) {
					System.out.println(name + "님은 목록에 없습니다.");
				}

			} else if (menu == 5) {
				// 종료
				System.out.println("종료합니다.");
				break end;

			} else {
				System.out.println("다시 입력하세요");
			}

		} // while end
		sc.close();
	} // main end
} // class end
