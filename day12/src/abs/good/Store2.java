package abs.good;

public class Store2 extends HeadStore{

	@Override
	public void apple() {
		System.out.println("부산 지점 사과 200원");
	}

	@Override
	public void bnanan() {
		System.out.println("부산 지점 바나나 300원");
	}

	@Override
	public void melon() {
		System.out.println("부산 지점 멜론 500원");
	}

	@Override
	public void orange() {
		System.out.println("부산 지점 오렌지 600원");
	}

}
