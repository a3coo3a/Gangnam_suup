package anonymous.basic02;

public class Computer {
	// 멤버변수
	private int sound;
	private RemoteControl remote;

	public Computer() {
		remote = new RemoteControl() {

			@Override
			public void volumeUp() {
				sound++;
				System.out.println("컴퓨터 볼륨 : " + sound);
			}

			@Override
			public void volumeDown() {
				sound--;
				System.out.println("컴퓨터 볼륨 : " + sound);
			}

			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다~");
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다~");
			}
		};
		
	}

	public int getSound() {
		return sound;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}

	public RemoteControl getRemote() {
		return remote;
	}

	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
}
