package sample_0411;

public class stringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		String a = "Mathmatical statistics is not good" ;
		String a1, a2, a3,a4,a5,a6;
		
		System.out.println("문자열의 길이 = "+a.length());
		
		a1 = a.concat("!!!!") ;
		a2= a.replace('s', 'S') ;
		a3= a.substring(3, 7) ;
		a4= a.toUpperCase() ;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
	}

}
