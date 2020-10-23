package main;

import java.util.Scanner;

import member_dao.InterMember;
import member_dao.MemberDAO;
import member_dao.MemberVO;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		InterMember dao = new MemberDAO();
		
		while (true) {

			System.out.println("[1.추가, 2.조회, 3.삭제]");
			String menu = sc.next();

			switch (menu) {
			case "1":

				System.out.print("id>");
				String id = sc.next();
				System.out.print("pw>");
				String pw = sc.next();
				System.out.print("name>");
				String name = sc.next();
				System.out.print("email>");
				String email = sc.next();

				MemberVO vo = new MemberVO(id, pw, name, email);
			
				
				int result = dao.insertMember(vo);
				
				if (result == 1) {
					System.out.println("입력성공");
				} else {
					System.out.println("입력실패");
				}
				
				
				break;
			case "2":

				break;

			case "3":

				break;

			default:
				break;
			}
			
			

		} // while end

	}// main end

}// class end
