package p1;

public class Person {// a class is just a template we create to construct objects
	//instance variables,fields,instance fields, attributes ,properties
	//objects == instances
	private String name;
	private double height;
	private int age;
	 String phone;
	 String food;
	
	//behavior
	//constructors
	public Person(String name, double height, int age, String string) { // overloaded constructors
		this.name = name;
				this.height = height;
		this.age = age;
	}
	
	public void setName(String name) {//setter, mutator
		this.name = name;
	}
	public String getName() {//getter, accessor
		return name;
	}
	public void setheight(double height) {//setter, mutator
		this.height = height;
	}
	public double getheight() {//getter, accessor
		return height;
	}
	public void setage(int age) {//setter, mutator
		this.age = age;
	}
	public int getage() {//getter, accessor
		return age;
	}
	public void setphone(String phone) {//setter, mutator
		this.phone = phone;
	}
	public String getphone() {//getter, accessor
		return phone;
	}
	public void eat(String food) {
	System.out.println(name +  " is eating " + food + "." );
	if (food.contentEquals("pasta")) {
		height ++;
		try {
		    int secondsToSleep = 1;
			Thread.sleep(secondsToSleep  * 1000);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}		
	}
	
	}
	public void walk(double distance) {
		System.out.println(name +" walks " + distance + " miles per day.");
	}
	public void study() {
		System.out.println(name + " studies!");
	}
	public String toString() {
		return name + ":" + height + "inches, Age:" + age + "years Old";
	}
}
