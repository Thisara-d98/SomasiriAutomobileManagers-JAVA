package Automobiles;

class Cardealer implements Dealers  {
	
	
	
	public void Dealerdetails() {
		CarspareDealers csd=new CarspareDealers();
		csd.SetCompanyname("AMW motors");
		csd.SetDebts(34000);
		csd.brand="TATA";
		csd.DisplayDealerDetails();
	}
}
