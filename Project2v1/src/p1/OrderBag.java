package p1;

import java.util.ArrayList;

public class OrderBag {
//	public static int nElems;
ArrayList<Book> orders = new ArrayList<Book>() ;


public void insertOrders(Book menuItem2) {
	 orders.add(menuItem2);
}

public void showOrders() {
	
		System.out.println(orders);
	
}
}
