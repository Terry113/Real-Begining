package p3_HW_revised;

public class Animal {
String type;
int age;
double weight;


public Animal(String type, int age, double weight) {
	super();
	this.type = type;
	this.age = age;
	this.weight = weight;
}
public Animal() {
	super();
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}

public void grow() {
	age++;
}
public void feed(double amount) {
	weight = weight + .3 * amount;
}
public void playTrick(String trick) {
	System.out.println("the " + type + " plays " + trick );
}
@Override
public String toString() {
	return "Animal [type=" + type + ", age=" + age + ", weight=" + weight + "]";
}




}
