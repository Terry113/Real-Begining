package p2;

public class Person {
private String name;
private static int id;
private int zipCode;
private static int idCount;
public Person(String name, int zipCode) {
	super();
	this.name = name;
	this.id = idCount++;
	this.zipCode = zipCode;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


public static int getId() {
	return id;
}

public int getZipCode() {
	return zipCode;
}
public void setZipCode(int zipCode) {
	this.zipCode = zipCode;
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", zipCode=" + zipCode + "]";
}

}
