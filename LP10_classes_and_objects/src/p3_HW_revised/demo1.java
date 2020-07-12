package p3_HW_revised;

public class demo1 {

	public static void main(String[] args) {
		Animal cat1 = new Animal ("cat", 5, 5.5);
		System.out.println(cat1);
		cat1.grow();
		System.out.println(cat1);
		cat1.feed(100);
		System.out.println(cat1);
		cat1.setAge(100);
		System.out.println(cat1.getAge());
		Copy_objects
	}

}
