package p2;
//parent Class or base class or superclass
public class Person {
private String name;
private String ID;
@Override
public String toString() {
	return "Person [name=" + name + ", ID=" + ID + "]";
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
public Person(String name, String iD) {
	super();
	this.name = name;
	ID = iD;
}
}
