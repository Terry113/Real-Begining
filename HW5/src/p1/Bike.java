package p1;

public class Bike {
	private double cost;
	private String color;
	private int speed;

	public Bike() {// deffault can be set up inside the constructor

	}

	public Bike(double cost, String color, int speed) {
		this.cost = cost;
		this.color = color;
		this.speed = speed;

	}
	

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void speedUp() {
		speed += 2;

	}

	public void slowDown() {
		speed -= 2;
		if (speed < 0) {
			speed = 0;
		}
	}

	public String toString() {
		return "the bike is" + cost + " and it is " + color + " and it is going " + speed + " miles fast.";
	}
	public String getSpeedAndColor() {
		return "speed=" + speed +"color=" + color;
		
	}
	public void setColorAndPrice(String color,double cost) {
		this.color = color;
		this.cost = cost;
		
	}
	
	public Bike (Bike newBikw) {
		this.speed = newBikw.speed;
		this.color = newBikw.color;
		this.speed = newBikw.speed;
	}
	

	public Bike deepCopy (Bike newBikw) {
		
		return new Bike(newBikw);
	}
	

	
	
	
}
