package p1;

public class Person {
	
	//instance variables values change from object to object
private String name;
private String id;
private double GPA;
private static final int idLength = 8;
// static variables; they are shares by all objects of this class
private static int count = 1;
 public Person(String name, double GPA) {
	 this.name = name;
	 this.id = String.valueOf(count++);
		 this.GPA = GPA;
}
 
 private String formatID(String rawid) {
	 String formattedId = id;
	  for (int i = 0; i< idLength - rawid.length(); i++) {
		   formattedId = "0" + formattedId;
		  
		 
	 }
	return formattedId;
 }
 //public void setCount(int count) {
//	 this.count = count;
 //}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + formatID(id) + ", GPA=" + GPA +" " + count + "]";
}
}
