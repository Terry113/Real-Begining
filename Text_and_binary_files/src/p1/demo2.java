package p1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class demo2 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("file2.txt");
pw.print("a");
pw.print("wrgdgsfsedf");

pw.close();
	}

}
