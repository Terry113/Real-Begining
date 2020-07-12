package p1;

public class demo1 {

	public static void main(String[] args) {
		
		
		// a class is a data type used to hold objects
		Person terry = new Person("Terry",65.5,14, "6311231234");
		terry.setName("terry");
		System.out.println(terry.getName());
		terry.setheight(500.0);
		terry.setage(500);
		terry.setphone("500");
		System.out.println(terry.getheight());
		System.out.println(terry.getage());
		System.out.println(terry.getphone());
		for(int i = 0;i<1000;i++) {
			
			
			terry.eat("pasta");
		}
		System.out.println(terry);
		System.out.println(terry.getheight());
	//	System.out.println(terry.name);
	//	System.out.println(terry.height + 1);
	//	System.out.println(terry.age);
	//	System.out.println(terry.phoneNumber);
	//	terry.eat("pasta");
	//	terry.walk(2);
	//	Person jason = new Person ("jason", 72.0,14,"631123342"); 
	//		
	//	System.out.println(jason.name);
	//	System.out.println(jason.height);
	///	System.out.println(jason.age);
	//	System.out.println(jason.phoneNumber);
	//	jason.study();
	//	Person hanxi = new Person ("Hanxi", 60, 14,"631,123,1234"); 
	//	System.out.println(hanxi.name);
	//	System.out.println(hanxi.height);
	//	System.out.println(hanxi.age);
	//	System.out.println(hanxi.phoneNumber);
	//	jason.name = "jay";
	//			System.out.println(jason.name);
	}
	

}
