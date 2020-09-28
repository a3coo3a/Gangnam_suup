package anonymous.basic02;

public class Tv {

	private int sound;
	private int channel;
	private RemoteControl remote;
	
	public Tv() {
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				sound += 2;
				System.out.println("Tv 볼륨 :" + sound);
			}
			
			@Override
			public void volumeDown() {
				sound -= 2;
				System.out.println("Tv 볼륨 :" + sound);				
			}
			
			@Override
			public void turnOn() {
				System.out.println("전원을 켜줄까요?");
			}
			
			@Override
			public void turnOff() {
				System.out.println("전원을 꺼줄까요?");
			}
		};
	}
	
	public int getSound() {
		return sound;
	}

	public void setSound(int sound) {
		this.sound = sound;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public RemoteControl getRemote() {
		return remote;
	}

	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}

	public void chChannel (int channel) {
		System.out.println(channel+"번으로 채널이 변경 되었습니다~");
	}
}
