package p2_static_methods;

import p2_static_methods.Person;

public class demo1 {

	public static void main(String[] args) {
	//	Person p1 = new Person("Adam",3.5);
	//	System.out.println(p1);
	//	Person p2 = new Person("Bill",3.0);
	//	System.out.println(p2);
	//	Person p3 = new Person("John",13.0);
	///	
	//	
	//	System.out.println(p3);
	//	Person.setCount(2000);
	//	Person p4 = new Person("John",13.0);
	////	System.out.println(p4);
		// to use a static methods, one doesn't need to have a object first
		
		Person p1 = new Person(null, 0); // using default value
		System.out.println((int)(5 + Math.random()*6 ));
		
	}

}
