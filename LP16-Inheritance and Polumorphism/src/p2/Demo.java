package p2;

public class Demo {

	public static void main(String[] args) {
	Student s1 = new Student("adam", "111",3.5);
Teacher t1 = new Teacher("bill", "222", 50000);
System.out.println(s1.getGPA());
//inheritance describes a "is a" relationship
//child class get everything from the parent class as 
//long as those things are not private
	}

}
