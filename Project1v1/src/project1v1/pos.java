package project1v1;

import java.util.Scanner;

public class pos {
	private static Scanner scan = new Scanner(System.in);
	private static String line = "-------------------------------";
	private static String menuForm = "%-10s%10s%10.2f%n";
	private static String menuExitForm = "%-10s%10s%n";
	private static String item = " ";
	private static double price = 0.00;
	private static boolean flag = true;
	
	private static String[] items = new String[4];
	private static double[] prices = new double[4];
	private static int[] numOfItems = new int[4];
	private static double subtotal = 0.0;
	private static int numberOfOrders = 0;

	public static void main(String[] args) {// refactoring
		login();
		do {
			showmenu();
			chooseItem();

		} while (flag);
		showReceipt();
	}

	private static void showmenu() {
		showHeader();
		fillItems();
		fillprices();
		System.out.println("\n" + line);
		System.out.printf(menuForm, "1", items[0], prices[0]);
		System.out.printf(menuForm, "2", items[1], prices[1]);
		System.out.printf(menuForm, "3", items[2], prices[2]);
		System.out.printf(menuForm, "4", items[3], prices[3]);
		System.out.printf(menuExitForm, "0", "exit");
	}

	private static void chooseItem() {
		System.out.println(line);
		System.out.println("Enter the number you want to order");
		int num = scan.nextInt();
				switch (num) {
		case 1:
			System.out.println("Enter the number of orders you want to order");
			numberOfOrders = scan.nextInt();
			
			item = "pork";
			price = 9.99;
			subtotal = price * numberOfOrders;
			showItems();
			numOfItems[0] = numberOfOrders;
			break;
		case 2:
			item = "lamb";
			price = 13.99;
			System.out.println("Enter the number of orders you want to order");
			numberOfOrders = scan.nextInt();
			subtotal = price * numberOfOrders;
			showItems();
			numOfItems[1] = numberOfOrders;
			break;
		case 3:
			item = "beef";
			price = 15.99;
			System.out.println("Enter the number of orders you want to order");
			numberOfOrders = scan.nextInt();
			subtotal = price * numberOfOrders;
			showItems();
			numOfItems[2] = numberOfOrders;
			break;
		case 4:
			item = "fish";
			price = 9.99;
			System.out.println("Enter the number of orders you want to order");
			numberOfOrders = scan.nextInt();
			subtotal = price * numberOfOrders;
			showItems();
			numOfItems[3] = numberOfOrders;
			break;
		case 0:
			System.out.println("the program ended");
			
			flag = false;
			break;
		default:
			System.out.println("there is no type that is on there");
		}

	}

	private static void login() {
		do {
			System.out.println("Enter a Username");
			String user = scan.nextLine();
			System.out.println("Enter a Password");
			String password = scan.nextLine();
			if (password.contentEquals("q") && user.contentEquals("w")) {
				System.out.println("Sucess!\n");
				break;

			}
			System.out.println("incorrect username or password!\n");

		} while (true);
	}

	private static void showItems() {
		System.out.println("you chose " + numberOfOrders + " " + item + " and it is $" + price + ".");
		System.out.println("the subtotal is " + subtotal);
		System.out.println();
	}

	private static void fillItems() {
		items[0] = "PORK";
		items[1] = "LAMB";
		items[2] = "BEEF";
		items[3] = "FISH";

	}

	private static void fillprices() {
		prices[0] = 9.99;
		prices[1] = 13.99;
		prices[2] = 15.99;
		prices[3] = 9.99;
	}
	private static void showReceipt() {
		System.out.printf("%n%25s%n%23s%n%n%-10s%7s%10s", "Terry's Restaurant", "(631-123-4567)", "Number of food", "Food",
				"Price");
		System.out.println("\n" + line);
		System.out.printf(menuForm, numOfItems[0], items[0], prices[0] * numOfItems[0]);
		System.out.printf(menuForm, numOfItems[1], items[1], prices[1] * numOfItems[1]);
		System.out.printf(menuForm, numOfItems[2], items[2], prices[2] * numOfItems[2]);
		System.out.printf(menuForm, numOfItems[3], items[3], prices[3] * numOfItems[3]);
		System.out.println(line);
		System.out.printf("%27s%5.2f", "TOTAL: ", prices[0] * numOfItems[0] + prices[1] * numOfItems
				[1] + prices[2] * numOfItems[2] + prices[3] * numOfItems[3]);
		
		
	}
	private static void showHeader() {
		System.out.printf("%n%25s%n%23s%n%n%-10s%10s%10s", "Terry's Restaurant", "(631-123-4567)", "Number", "Food",
				"Price");

}
}
