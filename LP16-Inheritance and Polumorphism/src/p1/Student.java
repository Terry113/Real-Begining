package p1;

public class Student {
private String name;
private String ID;
private double GPA;
public Student(String name, String iD, double gPA) {
	super();
	this.name = name;
	ID = iD;
	GPA = gPA;
}
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
public double getGPA() {
	return GPA;
}
public void setGPA(double gPA) {
	GPA = gPA;
}
@Override
public String toString() {
	return "Student [name=" + name + ", ID=" + ID + ", GPA=" + GPA + "]";
}

}
