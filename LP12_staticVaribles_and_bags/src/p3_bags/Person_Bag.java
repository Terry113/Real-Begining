package p3_bags;

public class Person_Bag {

	private Person[] arr;
	private int nElems = 0;

	public Person_Bag(int MaxSize) {
		arr = new Person[MaxSize];

	}

	public void insert(Person person) {

		arr[nElems++] = person;

	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
	}

	public Person removeById(String id) {
		int i = 0;
		for (i = 0; i < nElems; i++) {
			if (arr[i].getId().equals(id)) {
				break;
			}
		}
		if (i == nElems) {
			return null;
		} else {
			Person temp = arr[i];
			for (int j = i; j < nElems - 1; j++) {
				arr[j] = arr[j + 1];
			}
			nElems--;
			return temp;
		}

	}

	public Person findById(String id) {
		for (int i = 0; i < nElems; i++)
			if (arr[i].getId().equals(id)) {
				return arr[i];
			}
		return null;
	}
}