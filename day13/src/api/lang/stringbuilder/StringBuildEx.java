package api.lang.stringbuilder;

public class StringBuildEx {

	public static void main(String[] args) {

		// StringBuffer, StringBuilder - 사용방법이 String 과 거의 비슷하나 멀티스레드, 다중작업 환경에서 조금 다르게 동작한다.

		String str = new String("java");
		StringBuffer sb = new StringBuffer("java");

		System.out.println(str);
		System.out.println(sb);

		System.out.println("변경전 str :" + str.hashCode());
		System.out.println("변경전 sb :" + sb.hashCode());

		str = str + "choco";
		System.out.println(str); // String은 더한 후 str에 다시 저장시 자료가 2개가 생성되어 그중 주소값을 바꾸는 것

		sb.append("choco");
		System.out.println(sb); // StringBuffee,StringBuilder의 경우 원래 자료에 실제 더해지는 것

		System.out.println("변경후 str :" + str.hashCode());
		System.out.println("변경후 sb :" + sb.hashCode());

		// 끝에 문자열 추가
		sb.append("chip");
		System.out.println(sb);

		// 중간에 문자열 추가
		sb.insert(4, ",");
		System.out.println(sb);

		// 문자열 변경 (해당 인텍스 번째를 변경)
		sb.replace(0, 4, "자바");
		System.out.println(sb);

		// 문자열 삭제 (해당 인덱스부터 )
		sb.delete(2, sb.length());
		System.out.println(sb);

		// 문자열 뒤집기
		sb.reverse();
		System.out.println(sb);
		sb.reverse().reverse();
		System.out.println(sb);
		sb.reverse();	//원상복귀!
		System.out.println(sb);
		
		// toString() - 문자열로 바꿔주는 기능
		if (sb.toString().equals("자바")) {
			System.out.println("문자열이 같음.");
		}
		
		
	}

}
