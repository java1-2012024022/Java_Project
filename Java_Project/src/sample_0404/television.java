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
		System.out.println("ü���� " + channel + "�̰� ������ " + volume + "�Դϴ�.") ;
		
	}
}
