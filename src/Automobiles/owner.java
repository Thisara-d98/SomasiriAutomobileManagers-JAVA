package Automobiles;

abstract public class owner {

	String name;
	String hometown;
	int age;
	owner() {
		this.name="Not include";
		this.hometown="Not included";
		this.age=30;
		// TODO Auto-generated constructor stub
	}
	
	public void Printdetail() {
		System.out.println("Name is:"+name+" Hometown:"+hometown+" age:"+age);
	}

}
