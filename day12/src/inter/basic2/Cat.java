package inter.basic2;

public class Cat extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("냥냥이는 생선을 좋아해요");
	}
	@Override
	public void play() {
		System.out.println("냥냥이는 집에서 놀아요");
	}
}
