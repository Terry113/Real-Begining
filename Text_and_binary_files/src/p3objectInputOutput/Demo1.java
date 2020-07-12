package p3objectInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1 = new Person("jason", 14);
		Person p2 = new Person("terry", 14);
		
		FileOutputStream fos = new FileOutputStream("object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		
		FileInputStream fis = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person Jason = (Person)(ois.readObject());
		Person Terry = (Person)(ois.readObject());
		System.out.println(Jason);
		System.out.println(Terry);
		
	}

}
