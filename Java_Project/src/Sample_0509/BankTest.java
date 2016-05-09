package Sample_0509;

class Bank {
	double getInterestRate() {
		return 0.0;
	}
}

class BedBank extends Bank {
	double getInterestRate() {
		return 10.0;
	}
}

class NormalBank extends Bank {
	double getInterestRate() {
		return 5.0;
	}
}

class GoodBank extends Bank {
	double getInterestRate() {
		return 3.0;
	}
}

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BedBank b1 = new BedBank();
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();

		System.out.println("Bed Bank의 이자율 : " + b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate());

	}

}
