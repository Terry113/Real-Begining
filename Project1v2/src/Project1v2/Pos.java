package Project1v2;

import java.util.Scanner;

public class Pos {
	private static int[] itemsOrdered = new int[100];// pork
	private static boolean isEndOfDayFlag = false;
	private static int numOfItemsOrder = 0; // counts things you ordered things but don't know what it is
	private static Scanner scan = new Scanner(System.in);
	private static final String RESTAURANT_NAME = "Terry's Restaurant";
	private static final String RESTAURANT_PHONE = "(631-123-4567)";
	private static final String HEADER_FORMAT = "%n%25s%n%23s%n%n%-10s%10s%10s";
	private static final String LINE = "-------------------------------";
	private static final int TOTAL_MENU_ITEMS = 4;
	private static String[] descriptions = new String[TOTAL_MENU_ITEMS];
	private static double[] prices = new double[TOTAL_MENU_ITEMS];
	private static int[] numOfItems = new int[TOTAL_MENU_ITEMS];// how many porks
	private static final String MENU_ITEM_FORMAT = "%-10d%10s%10.2f%n";
	private static final String MENU_EXIT_FORMAT = "%-10s";
	private static int numOfOrders = 0;// how many porks
		private static double[] subtotal = new double[TOTAL_MENU_ITEMS];
		private static double total = 0.00;
	private static double grandtotal = 0.00;
	
	

	public static void main(String[] args) {
		login();

		do {
			showMenu();
			chooseItemsAndQuantity();

			if (isEndOfDay()) {
				isEndOfDayFlag = true;
				showReports();
			}
		} while (!isEndOfDayFlag);

	}

	private static void showReports() {
		showTotalHeader();
		System.out.println("the Grand total is: " + grandtotal);

	}

	private static void showTotalHeader() {
		System.out.printf(HEADER_FORMAT, RESTAURANT_NAME, RESTAURANT_PHONE, "NUMBER_OF_ITEMS_TOTAL", " DESCRPTION",
				" Subtotal");
		System.out.println("\n" + LINE);
		
		
		
	}

	private static void showReceipt() {
		showReciptHeader();
		for (int i = 0; i < numOfItemsOrder; i++) {
			
			System.out.printf(MENU_ITEM_FORMAT, numOfItems[itemsOrdered[i]-1], descriptions[itemsOrdered[i]-1], subtotal[itemsOrdered[i]-1]);
total += subtotal[itemsOrdered[i - 1]];
		}
		System.out.println("total: " + total);
		calculateTotal();
	}

	private static void calculateTotal() {
		grandtotal += total;
		
	}

	private static void showReciptHeader() {

		System.out.printf(HEADER_FORMAT, RESTAURANT_NAME, RESTAURANT_PHONE, "NUMBER_OF_ITEMS ", "DESCRPTION",
				"Subtotal");
		System.out.println("\n" + LINE);

	}

	private static void chooseItemsAndQuantity() {
		
		System.out.println(LINE);
		System.out.println("Enter the item number you want to order");
		int num = scan.nextInt();//get item num 
		
		int index = -1;
		index = num - 1;
		if (num != 0 && num != 100) {
			askQuantity(); //get num of orders
			itemsOrdered[index] = num; //record what was ordered
			  numOfItemsOrder ++;
		}
		
  
		switch (num) {

		case 1:

			subtotal[index] = prices[index] * numOfOrders;

			numOfItems[index] = numOfOrders;
			break;
		case 2:

			subtotal[index] = prices[index] * numOfOrders;

			numOfItems[index] = numOfOrders;
			break;
		case 3:

			subtotal[index] = prices[index] * numOfOrders;

			numOfItems[index] = numOfOrders;
			break;
		case 4:

			subtotal[index] = prices[index] * numOfOrders;

			numOfItems[index] = numOfOrders;
			break;
		case 0:
			showReceipt();
			break;
		case 100:
			isEndOfDayFlag = true;
			break;
		default:
			System.out.println("there is no type that is on there");
		}
		
		  
	}

	private static void askQuantity() {
		System.out.println("Enter the number of orders you want to order");
		numOfOrders = scan.nextInt();

	}

	private static void showMenu() {
		showHeader();
		showItems();
		showEndOfOrder();
		showEndOfDay();

	}

	private static void showEndOfDay() {
		System.out.printf("%-10d%20s%n", 100, "End Of Day");

	}

	private static void showEndOfOrder() {
		System.out.printf("%-10d%20s%n", 0, "Exit");

	}

	private static void showItems() {
		fillItems();
		fillPrices();
		displayItems();

	}

	private static void displayItems() {
		System.out.println("\n" + LINE);
		for (int i = 0; i < TOTAL_MENU_ITEMS; i++) {

			System.out.printf(MENU_ITEM_FORMAT, i + 1, descriptions[i], prices[i]);
		}
	}

	private static void fillItems() {
		descriptions[0] = "pork";
		descriptions[1] = "LAMB";
		descriptions[2] = "BEEF";
		descriptions[3] = "FISH";

	}

	private static void fillPrices() {
		prices[0] = 9.99;
		prices[1] = 13.99;
		prices[2] = 15.99;
		prices[3] = 9.99;
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

	private static boolean isEndOfDay() {

		return isEndOfDayFlag;
	}

	private static void showHeader() {
		System.out.printf(HEADER_FORMAT, RESTAURANT_NAME, RESTAURANT_PHONE, "ITEM", "DESCRPTION", "PRICE");

	}

}
