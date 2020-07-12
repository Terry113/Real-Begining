package p1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GrandTotalBag {
//	public static int nElems;
	
public static ArrayList<Book> ordersTotal = new ArrayList<Book>();


public void insertOrders(Book menuItem2) {
	 ordersTotal.add(menuItem2);
}

public void showTotalOrders() throws FileNotFoundException {
	PrintWriter pw = new PrintWriter("file1.txt");
	pw.print(ordersTotal);
		System.out.println(ordersTotal);
	
}

}
