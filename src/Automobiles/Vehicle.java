package Automobiles;

public class Vehicle {
	
	private int noofwheels;
	private int weight;
	
	private int enginePower;
	String colour;
	
	Vehicle(){
		noofwheels=4;
		weight=0;
		colour="Not included";
		enginePower=1000;
	}
	
	public void SetNoofWheels(int noofwheels) {this.noofwheels=noofwheels;}
	public void SetWeight(int weight) {this.weight=weight;}
	public void SetEnginePower(int enginePower) {this.enginePower=enginePower;}
	
	public int Getnoofwheels() { return this.noofwheels;}
	public int GetWeight() {return this.weight;}
	public int GetEnginepower() {return this.enginePower;}
	public String GetColour() {return this.colour;}
	
	
	Vehicle(int noofwheels,int weight,String colour,int enginepower){
		this.noofwheels=noofwheels;
		this.weight=weight;
		this.colour=colour;
		this.enginePower=enginepower;
	}
	
	Vehicle(int noofwheels,String colour){
		this.noofwheels=noofwheels;
		this.colour=colour;
	}
	
	void PrintIntro(){
		System.out.println("This is a vehicle");
	}
	

	public void PrintDetails() {
		// TODO Auto-generated method stub
		System.out.println("This is a vehicle with "+enginePower+"cc");
	}
	public void PrintReceived() {
		System.out.println("Receved vehicle");
	}
	
}
