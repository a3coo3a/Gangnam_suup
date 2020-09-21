package quiz;

public class Quiz12 {

	public static void main(String[] args) {
		/*
		 * Math.randaom()을 이용해서 0~3까지 랜덤수를 만듭니다.
		 * 해당 랜덤수를 배열에 index에 적용해서
		 * 선택된 단어가 한국어, 영어, 중국어 인지 처리하세요
		 *  
		 */

		String[] arr = {"안녕", "hello", "니하오", "@#$"};

		int index = (int)(Math.random()*arr.length);
		String lang = "";

		switch (arr[index]) {
		case "안녕":
			lang = "한국어";
			break;
		case "hello":
			lang = "영어";
			break;
		case "니하오":
			lang = "중국어";
			break;
		default:
			lang = "외계어";
			break;
		}

		System.out.println("랜덤수 : " + index);
		System.out.println(arr[index] + "은 " + lang + " 입니다.");



	}

}
