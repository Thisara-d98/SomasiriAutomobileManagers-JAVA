package Automobiles;
import Staffdetails.*;
public class AutomobileManagement {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Vehicle v1=new Vehicle();
		Car c1=new Car();
//		c1.colour="Red";
//		c1.drive="4 wheel";
//		c1.enginePower=4500;
//		c1.noofseats=5;
//		c1.weight=11000;
		
		c1.SetEnginePower(5000);
		c1.SetNoofWheels(8);
		c1.SetWeight(5000);
		c1.colour="Blue";
		c1.PrintCarDetails();
		c1.PrintIntro();
		v1.PrintIntro();
		c1.PrintDetails();
		c1.PrintReceived();
		bankdetail b1=new bankdetail("BOC","Katugasthota",8431245);
		b1.name="Piyal";
		b1.hometown="Kandy";
		b1.age=33;
     	b1.Printdetail();
     	b1.Printdetail();
     	
     	Cardealer cd=new Cardealer();
     	cd.Dealerdetails();
     	
	}

}
