package Automobiles;

public class Car extends Vehicle {
	
	String drive;
	int noofseats;
	
	Car(){
		drive ="2 wheel";
		noofseats=5;
	}
	
	void PrintCarDetails() {
		System.out.println("No of wheels:"+this.Getnoofwheels()+"\ncolour:"+this.GetColour()+"\nEngine:"+this.GetEnginepower()+"\nDrive:"+drive);
		System.out.println("No of Seats:"+noofseats);
	}
	@Override
	void PrintIntro() {
		System.out.println("This is car");
	}
	
	public void PrintDetails() {
		super.PrintDetails();
		System.out.println("This is a car with "+drive+"Drive");
	}
}
