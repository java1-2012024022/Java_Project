package Sample_0509;

abstract class Animal2 {
	void sound() {
		//System.out.println("Ani");
	}
	void eat(){
		//System.out.println("ani eat");
	}
}

class Dog extends Animal2 {
	private int d = 11;
	@Override
	void sound() {
		System.out.println("Dog"+d);
	}
}

class Cat extends Animal2 {
	private int c = 99;
	@Override
	void sound() {
		System.out.println("Cat"+c);
	}
}

public class Dynamic_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog b = new Dog();
		Cat c = new Cat();
		b.sound();
		c.sound();
		test(b);
		test(c);
	}

	static void test(Animal2 temp) {
		temp.sound();
	}

}
