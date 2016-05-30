package sample_0530;

interface RemoteControl{

	void turnOn();

	void turnOff();
}


public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoteControl ac = new RemoteControl() {
			public void turnOn() {
				System.out.println("Tv turnOn()");
			}

			public void turnOff() {
				System.out.println("Tv turnOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();

	}
}
