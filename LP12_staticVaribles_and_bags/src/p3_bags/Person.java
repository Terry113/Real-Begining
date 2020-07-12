package p3_bags;

public class Person {
private String name;
private String id;
private double gpa;


private static int idcount = 0;


public Person(String name, double gpa) {
	
	this.name = name;
	this.gpa = gpa;
	id = String.valueOf(idcount++);
	
}




public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getGpa() {
	return gpa;
}


public void setGpa(double gpa) {
	this.gpa = gpa;
}


public int getIdcount() {
	return idcount;
}


public void setIdcount(int idcount) {
	this.idcount = idcount;
}


public String getId() {
	return id;
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", gpa=" + gpa + ", idcount=" + idcount + "]";
}







}
