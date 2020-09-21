package exam01;

public class Tv {
	
	private boolean power;
	private int channel;
	int prevChannel;
	private int volume;

	public boolean getPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
		if (power) {
			System.out.println("전원을 끕니다");
		} else {
			System.out.println("전원을 켭니다");
		}

	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume >= 1 && volume <= 100) {
			this.volume = volume;
		} else {
			System.out.println("1~100사이 번호를 입력하세요");
		}
	}

}
