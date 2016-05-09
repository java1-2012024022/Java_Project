package Sample_0509;

class par {
	par() {
		System.out.println("Par con");
	}

	par(int x) {
		System.out.println("Par con" + x);
	}
}

class child extends par {
	int xxx;

	/*
	 * child(){ //System.out.println("child con"); }
	 */
	public child(int y) {
		super(8);// 명시적 호출
		System.out.println("child con");
	}

	public child() {
		System.out.println("child con nothing");

	}
}

public class Con_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c1 = new child();
		child c2 = new child(7);

	}

}
