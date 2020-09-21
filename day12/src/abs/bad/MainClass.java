package abs.bad;

public class MainClass {
	public static void main(String[] args) {
		
		
		// 재정의를 빼먹었다면,잘못된 메서드의 실행으로 이어질 수도 있다는 뜻
		Store s = new Store();
		s.apple();
		s.bnanan();
		s.melon();
		s.orange();
		
	}
}
