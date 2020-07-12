package p2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileOutputString {
	public static void main(String[] args) throws IOException {
		FileOutputStream fis = new FileOutputStream("BinaryFile1.dat");

		DataOutputStream dis = new DataOutputStream(fis);
		
		 dis.writeInt(100); 
		 
		 dis.writeInt(101); 
		 
		dis.close();
		
		FileInputStream fos = new FileInputStream("BinaryFile1.dat");

		DataInputStream dos = new DataInputStream(fos);
		
		System.out.println(dos.readInt() + dos.readInt());

		dos.close();
	}
}
