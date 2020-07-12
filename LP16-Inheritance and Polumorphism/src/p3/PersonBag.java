package p3;

import p2.Person;

public class PersonBag {
	private Person[] arr;
	private int nElems;

	public PersonBag(int size) {
		Person[] arr = new Person[size];
	}

	public void insert(Person person) {
		arr[nElems++] = person;
	}

	public void display(PersonBag personBag) {
		for (int i = 0; i < nElems; i++) {
			System.out.println(personBag);
		}
	}
}
