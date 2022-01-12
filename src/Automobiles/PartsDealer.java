package Automobiles;

public class PartsDealer {
	private String companyname;
	private int debts;
	
	PartsDealer(){
		this.companyname="No";
		this.debts=0;
	}
	
	public void SetCompanyname(String companyname){this.companyname=companyname;}
	public void SetDebts(int debts) {this.debts=debts;}
	
	public String GetCompanyname() {return this.companyname;}
	public int GetDebts() {return this.debts;}
}
