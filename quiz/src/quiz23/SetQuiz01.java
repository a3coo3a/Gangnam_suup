package quiz23;

import java.util.*;

public class SetQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 1. Random객체를 이용해서 1~45랜덤수를 만들고
		 * 2. set을 이용해서 6개의 로또 번호를 만드세요
		 */
		
		Random ran = new Random();
		
		TreeSet<Integer> ranNum = new TreeSet<Integer>();
		
		while(ranNum.size() != 6) {
			ranNum.add(ran.nextInt(45)+1);
		}
		
		System.out.println(ranNum.toString());
		
	}
}
