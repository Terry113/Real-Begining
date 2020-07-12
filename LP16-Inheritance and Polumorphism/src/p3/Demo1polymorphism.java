package p3;

import p2.Person;

public class Demo1polymorphism {

	public static void main(String[] args) {
		PersonBag personBag = new PersonBag(100);
		Person[] persons = new Person[100];
		Person p1 = new Person("a", "1");
		personBag.insert(p1);
		personBag.display(personBag);
//superclass type can store subclass type
		//we can divorce variable type from object type
		
	//	p2 object type is person
	}

}
