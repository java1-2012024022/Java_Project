package sample_0328;

public class googoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 9; i++) {
			for (int j = 3; j <= 9; j += 2) {
				System.out.print(j + "*" + i + "=" + i * j + " ");
				// if(j==9) System.out.println(" ");
			}
			System.out.println(" ");
		}
	}

}
