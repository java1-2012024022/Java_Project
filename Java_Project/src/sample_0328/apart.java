package sample_0328;

public class apart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 900; i >= 100; i -= 100) {
			for (int j = 1; j <= 8; j++) {
				if (j >= 6 && i >= 600)
					break; // countinue;
				System.out.print(i + j + " ");
			}
			System.out.println(" ");
		}

	}

}
