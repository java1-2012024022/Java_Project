package sample_0404;

public class television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	television(int c, int v, boolean o) {
		channel =c ;
		volume = v;
		onOff = o;
		
	}

	void print() {
		System.out.println("체널은 " + channel + "이고 볼륨은 " + volume + "입니다.") ;
		
	}
}
