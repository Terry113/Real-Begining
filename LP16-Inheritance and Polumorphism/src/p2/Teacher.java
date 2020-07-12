package p2;

public class Teacher extends Person {
private double salery;

public Teacher(String name, String iD, double salery) {
	super(name, iD);
	this.salery = salery;
}

public double getSalery() {
	return salery;
}

public void setSalery(double salery) {
	this.salery = salery;
}

@Override
public String toString() {
	return "Teacher [salery=" + salery + ", getName()=" + getName() + ", getID()=" + getID() + "]";
}


}
