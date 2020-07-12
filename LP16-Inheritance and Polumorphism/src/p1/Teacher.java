package p1;

public class Teacher {
private String name;
private String ID;
private double salery;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public double getSalery() {
	return salery;
}
public void setSalery(double salery) {
	this.salery = salery;
}
public Teacher(String name, String iD, double salery) {
	super();
	this.name = name;
	ID = iD;
	this.salery = salery;
}
@Override
public String toString() {
	return "Teacher [name=" + name + ", ID=" + ID + ", salery=" + salery + "]";
}
}
