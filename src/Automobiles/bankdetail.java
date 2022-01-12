package Automobiles;

public class bankdetail extends owner {
	String bank;
	int accno;
	String branch;
	void Printbankdetail() {
		System.out.println("Bank:"+bank+" accno:"+" branch:"+branch);
	}; 
	
	bankdetail(String bank,String branch,int accno){
		this.bank=bank;
		this.accno=accno;
		this.branch=branch;
	}
	@Override
	public void Printdetail() {
		System.out.println("This print details");
	}
}
