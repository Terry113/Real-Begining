package p1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {

	public static void main(String[] args) throws IOException {
		double ds;
		FileOutputStream fis = null;
		try {
			fis = new FileOutputStream("BinaryFile1.dat");
		} catch (FileNotFoundException e) {

			System.out.println("there is a problem");
		}

		DataOutputStream dis = new DataOutputStream(fis);
		int randomNum = (int) (Math.random() * 100);
		for (int i = 0; i < randomNum; i++) {
			ds = Math.random() * 50;
			dis.writeDouble(ds);

			System.out.println(ds);
		}
		dis.close();

		FileInputStream fos = new FileInputStream("BinaryFile1.dat");

		DataInputStream dos = new DataInputStream(fos);
		while (true) {
			try {
				dos.readInt();
			} catch (IOException e) {
				
				e.printStackTrace();
				break;
			}
		}

		dos.close();
	}
}
