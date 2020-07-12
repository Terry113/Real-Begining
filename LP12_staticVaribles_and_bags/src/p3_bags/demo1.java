package p3_bags;

public class demo1 {

	public static void main(String[] args) {
		Person_Bag myBag = new Person_Bag(100);
		Person p1 = new Person("a",1);
		myBag.insert(p1);
		Person p2 = new Person("b",2);
		myBag.insert(p2);
		myBag.display();
		System.out.println(myBag.findById("0"));
		System.out.println(myBag.removeById("0"));
		myBag.display();

	}
	
}
