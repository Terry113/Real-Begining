package p2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fis = new FileOutputStream("BinaryFile1.dat");

		DataOutputStream dis = new DataOutputStream(fis);
		
		 dis.writeInt(100); 
		 
		 dis.writeInt(101); 
		 
		dis.close();
	}
}
