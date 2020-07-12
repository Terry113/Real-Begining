package p2;

public class Student extends Person {


private double GPA;

public Student(String name, String iD,double GPA) {
	super(name, iD);
	this.GPA = GPA;
	
}







public double getGPA() {
	return GPA;
}

@Override
public String toString() {
	return "Student [getName()=" + getName() + ", getID()=" + getID() + ", GPA=" + GPA + "]";
}







public void setGPA(double gPA) {
	GPA = gPA;
}
//@Override
//public String toString() {
//	return "Student [Person()=" + super.toString() + ", GPA=" + GPA + "]";
//}
}
