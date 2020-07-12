package p1;

import java.util.Scanner;

public class demoMenuItems1 {
	public static String menuItemFormat = "%-5d%10S%10.2f%5d%10.2f%n";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MenuItem1[] menuItems = new MenuItem1[100];
		int menuItemCount = 0;
		for (int i = 0; i < 4; i++) {
			System.out.println("enter itemNumber, description, quantity, and price.");
			String entry = scan.nextLine();
			String[] entryTokens = entry.split(" ");
			int itemNumber = Integer.parseInt(entryTokens[0]);
			String description = entryTokens[1];

			double price = Double.parseDouble(entryTokens[3]);
			MenuItem1 menuItem = new MenuItem1(itemNumber, description, price);
			int quantity = Integer.parseInt(entryTokens[2]);
			menuItem.setDescription(description);
			menuItem.setItemNum(itemNumber);
			menuItem.setPrice(price);
			menuItem.setQuantity(quantity);
			menuItem.setSubtotal();
			System.out.printf(menuItemFormat, itemNumber, description, price, quantity, menuItem.getSubtotal());
			menuItems[menuItemCount++] = menuItem;
		}

		for (int i = 0; i < menuItemCount; i++) {
			System.out.println(menuItems[i]);
		}

		// for (int i = 0; i < 4; i++) {
		// menuItems[i].getSubtotal();
		//
		// System.out.println(menuItems[i]);
		// }
	}
}
