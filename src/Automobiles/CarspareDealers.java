package Automobiles;

public class CarspareDealers extends PartsDealer {
	String brand;
	
	public void DisplayDealerDetails(){
		System.out.println("Companyname:"+this.GetCompanyname()+" Debts:"+this.GetDebts()+" Brand:"+this.brand);
	}
}
