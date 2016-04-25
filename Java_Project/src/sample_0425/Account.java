package sample_0425;

public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	Account(){
		this(1,"3",4);
	}
	
	Account(int regNumber, String name, int balance){
		this.regNumber = regNumber;
		this.name = name;
		this.balance = balance ;
		
	}
	
	public String getName(){ return name ;}
	public void setName(String name){ this.name = name ; }
	public int getBalance(){ return balance;}
	public void setBalance (int balance){ this.balance = balance ;}

}