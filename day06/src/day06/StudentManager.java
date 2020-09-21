package day06;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] nameList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] ageList = new int[100];

		// 현재 위치를 나타내는 변수 index, 시작은 -1
		int index = -1;
		// 저장된 사람수를 알기 위한 변수 count
		int count = 0;

		end:while (true) {

			System.out.println("-------------------------------------");
			System.out.println("[[ 메 뉴  ]]");
			System.out.println("1. Insert     2. Prev     3. Next     4. Current");
			System.out.println("5. Update     6. Delete   7. Quit");
			System.out.print("메뉴 입력  > ");
			String menu = scan.next();

			
			
			switch (menu) {
			case "insert":
			case "i":
			case "1":	// insert
				System.out.println("----- 고객 정보 입력 -----");
				// 이름, 성별, 이메일, 나이를 받아서 각각 배열에 저장, 사람수를 증가
				
				index++;
				System.out.print("이름 > ");
				nameList[index] = scan.next();
				System.out.print("성별 > ");
				genderList[index] = scan.next();
				System.out.print("이메일 > ");
				scan.nextLine();
				emailList[index] = scan.nextLine();
				System.out.print("나이 > ");
				ageList[index] = scan.nextInt();
				count++;
				System.out.println(nameList[index] + "님의 정보가 입력되었습니다");
				
				break;
			case "prev":
			case "p":
			case "2": // prev
				System.out.println("----- 이전 고객 정보 -----");
				// 현재 위치 기반으로 index이동해서 이전 정보를 출력
				// index <= 0 : 이전고객은 없음
				index--;
				if(index < 0) {
					System.out.println("이전 고객은 없습니다.");
					index++;
				}else {
					System.out.println("＊ 이름 : " + nameList[index]);
					System.out.println("＊ 성별 : " + genderList[index]);
					System.out.println("＊ 메일 : " + emailList[index]);
					System.out.println("＊ 나이 : " + ageList[index]);
				}
				break;
			case "n":
			case "next":
			case "3": //next
				System.out.println("----- 다음 고객 정보 -----");
				// index = 2, count = 3 이면 다음이 없는 거니까~ 다음 고객 정보를 출력 할 수 없으~
				index++;
				if(index >= count) {		// 위치가 마지막에 있는 경우
					System.out.println("다음 고객은 없습니다.");
					index--;
				}else {
					System.out.println("＊ 이름 : " + nameList[index]);
					System.out.println("＊ 성별 : " + genderList[index]);
					System.out.println("＊ 메일 : " + emailList[index]);
					System.out.println("＊ 나이 : " + ageList[index]);
				}
				break;
			case "c":
			case "current":
			case "4": // current
				System.out.println("----- 현재 고객 정보 -----");
				// 현재 위치를 출력할 수 있는 조건을 생각해서 현재 위치를 출력하면 됩니다.
				// 그렇지 않으면 "현재 고객정보가 없습니다."
				if(index < 0 || index >= count) { // 사람수보다 많으면 현재 고객 정보는 없음.
					System.out.println("현재 고객정보가 없습니다.");
				}else {
					System.out.println("＊ 이름 : " + nameList[index]);
					System.out.println("＊ 성별 : " + genderList[index]);
					System.out.println("＊ 메일 : " + emailList[index]);
					System.out.println("＊ 나이 : " + ageList[index]);
				}
				break;
			case "u":
			case "update":
			case "5": // update
				System.out.println("----- 고객 정보 수정 -----");
				// 현재 위치를 출력할 수 있는 조건을 생각해서
				// 스캐너를 통해 순서대로 이름, 성별, 이메일, 나이를 입력 받고 배열의 값을 수정
				if(index < 0) {
					System.out.println("현재 고객정보가 없습니다.");
				}else {
					System.out.println("수정할 정보를 입력하세요");
					System.out.print("이름("+nameList[index]+") > ");
					nameList[index] = scan.next();
					System.out.print("성별("+genderList[index]+") > ");
					genderList[index] = scan.next();
					System.out.print("이메일("+emailList[index]+") > ");
					scan.nextLine();
					emailList[index] = scan.nextLine();
					System.out.print("나이("+ageList[index]+") > ");
					ageList[index] = scan.nextInt();
				}
				break;
			case "delete":
			case "d":
			case "6": // delete
				System.out.println("----- 고객 정보 삭제 -----");
				// 현재 정보를 삭제 할 수 있는 조건을 생각해서
				// 현재 index부터 ~~ 뒤에 있는 배열 요소를 당겨와서 덮어 씌웁니다.
				// 고객 수 를 감소
				// 그렇지 않으면, "삭제할 데이터가 없습니다" 출력
				if(index < 0 || index >= count) {
					System.out.println("삭제할 정보가 없습니다.");
				}else {	// 끌어 당겨 덮는 삭제 작업
					for(int i = index; i <= count-1; i++) {
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1];
						emailList[i] = emailList[i+1];
						ageList[i] = ageList[i+1];
					}
					System.out.println(nameList[index] + "님의 정보가 삭제 되었습니다.");
					count--;		// 한명 감소
					if(index == count) index--;		// 맨끝 정보 삭제의 경우
				}
				break;
			case "quit":
			case "q":
			case "7": // quit
				System.out.println("-------- 종 료  --------");
				System.out.println("다음에 만나요~~ \\\\ > 0 < //");
				break end;
			default:
				System.out.println("없는 메뉴입니다.");
				break;
			}
			
			for (int i = 0; i < count; i++) {
				if (index == i) {
					System.out.print("●");
				} else {
					System.out.print("○");
				}
				System.out.print(" ");
			}
			System.out.println();
			
		} // while end

		scan.close();
	}
}
