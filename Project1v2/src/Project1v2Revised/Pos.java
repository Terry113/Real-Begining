package Project1v2Revised;

import java.util.Scanner;

public class Pos {
	private static Scanner scan = new Scanner(System.in);
	// finals
	private static int TOTAL_MENU_ITEMS = 0;
	private static final String RESTAURANT_NAME = "Terry's Restaurant";
	private static final String RESTAURANT_PHONE = "(631-123-4567)";
	private static final String HEADER_FORMAT = "%n%25s%n%23s%n%n%-10s%10s%10s";
	private static final String LINE = "-------------------------------";
	private static final String EDIT_FORMAT = "%-10d%s%n";
	private static final String MENU_ITEM_FORMAT = "%-10d%10s%10.2f%n";

	// flags
	private static boolean isEndOfDayFlag = false;
	// arrays

	private static int[] totalQuantity = new int[50]; // NE
	// means non edit
	// private static double[] pricesNE = new double[TOTAL_MENU_ITEMS];

	private static int[] quantity = new int[100];
//   static constants

	private static int numOfOrders = 0;// how many porks
	private static int[] itemsOrdered = new int[100];// pork
	private static int itemCounter = 0;

	private static double preTaxGrandTotal = 0.00;
	private static double grandTotal = 0.00;
	private static double totalTax = 0.00;
	private static int totalItemCounter = 0;

	// edit variables

	private static String[] descriptions = new String[TOTAL_MENU_ITEMS];
	private static double[] prices = new double[TOTAL_MENU_ITEMS];

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

	private static void showReceipt(int itemCounter, int[] quantity, int[] itemsOrdered) {
		showReciptHeader();
		double totalPreTax = 0.00;
		for (int i = 0; i < itemCounter; i++) {

			System.out.printf(MENU_ITEM_FORMAT, quantity[i], descriptions[itemsOrdered[i]],
					prices[itemsOrdered[i]] * quantity[i]);
			totalPreTax += prices[itemsOrdered[i]] * quantity[i];
		}
		System.out.printf("%s%5.2f", "total: ", totalPreTax);
		calculateTotal(totalPreTax);
		totalItemCounter++;
	}

	private static void calculateTotal(double totalPreTax) {
		preTaxGrandTotal += totalPreTax;
		spacing();

	}

	private static void chooseItemsAndQuantity() {

		System.out.println("enter Item Number");
		spacing();
		int itemNumber = scan.nextInt();
		int index = 0;
		if (itemNumber == 0) {
			showReceipt(itemCounter, quantity, itemsOrdered);
			numOfOrders = 0;

			itemCounter = 0;

		} else if (itemNumber == 200) {
			editMenu();

		} else if (itemNumber == 100) {
			isEndOfDayFlag = true;
			System.out.println(totalItemCounter);

		} else {
			numOfOrders = askQuantity();
			index = itemNumber - 1;
			quantity[itemCounter] = numOfOrders;
			itemsOrdered[itemCounter++] = index;
			calculateTotalQuantity();
			
				}
			}
		
	

	private static void calculateTotalQuantity() {
		for (int i = 0; i < 50; i++) {

			for (int j = 0; j < 50; j++) {
				if (itemsOrdered[i] == j) {

					totalQuantity[i] += quantity[i];

				}
			}
		}
	}

	private static void editMenu() {
		System.out.println(LINE);
		System.out.printf(EDIT_FORMAT, 1, "Add Item");
		System.out.printf(EDIT_FORMAT, 2, "Remove Item");
		System.out.printf(EDIT_FORMAT, 3, "Edit Item");
		System.out.printf(EDIT_FORMAT, 4, "Edit Price");
		System.out.println();
		System.out.println(LINE);
		System.out.println("What Would You Like To Do?");
		int editNumber = scan.nextInt();
		switch (editNumber) {
		case 1:
			addNewItems();
			break;
		case 2:
			removeItems();
			break;
		case 3:
			editDescription();
			break;
		case 4:
			editPrice();
			break;
		default:
			System.out.println("Invaild Number");
			break;
		}

	}

	private static void showReports() {
		calculateTotalQuantity();
		System.out.println("there were " + totalItemCounter + "orders" );

		System.out.println("the Pre-tax total is: " + preTaxGrandTotal);
		totalTax = preTaxGrandTotal * 0.08625;
		System.out.printf("%s%5.2f", "the Total Tax Is: ", totalTax);
		grandTotal = preTaxGrandTotal * 1.08625;
		System.out.println();
		System.out.printf("%s%5.2f", "the Grand Total is ", grandTotal);

	}

	private static void showReciptHeader() {

		System.out.printf(HEADER_FORMAT, RESTAURANT_NAME, RESTAURANT_PHONE, "NUMBER_OF_ITEMS ", "DESCRPTION",
				"Subtotal");
		System.out.println("\n" + LINE);
	}

	private static int askQuantity() {
		System.out.println("Enter the number of orders you want to order");
		int numOfOrders = scan.nextInt();
		return numOfOrders;
	}

	private static void showMenu() {

		showItems();
		showEndOfOrder();
		showEndOfDay();
		showEditMenu();

	}

	private static void showEditMenu() {
		System.out.printf("%-10d%20s%n", 200, "Edit Menu");

	}

	private static void showEndOfDay() {
		System.out.printf("%-10d%20s%n", 100, "End Of Day");

	}

	private static void showEndOfOrder() {
		System.out.printf("%-10d%20s%n", 0, "Exit");

	}

	private static void showItems() {
		// fillItems();
		// fillPrices();

		if (TOTAL_MENU_ITEMS == 0) {
			editMenu();

		}

		showDescriptions();
	}

	// private static void displayItems() {
	// System.out.println("\n" + LINE);
	// for (int i = 0; i < TOTAL_MENU_ITEMS; i++) {
//
//			System.out.printf(MENU_ITEM_FORMAT, i + 1, descriptions[i], prices[i]);
//		}
//	}

//	 private static void totalItemsCounter() {
//	 totalQuantity[0] = 0;
//	 totalQuantity[1] = 0;
//	 totalQuantity[2] = 0;
//	 totalQuantity[3] = 0;

//	 }

	// private static void fillPrices() {
	// pricesNE[0] = 9.99;
	// pricesNE[1] = 13.99;
	// pricesNE[2] = 15.99;
	// pricesNE[3] = 9.99;
	// }

	private static void login() {
		do {
			System.out.println("Enter a Username");
			String user = scan.nextLine();
			System.out.println("Enter a Password");
			String password = scan.nextLine();
			if (password.contentEquals("w") && user.contentEquals("q")) {
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
		System.out.println();
	}

	private static void spacing() {
		System.out.println();
		System.out.println();
		System.out.println();
	}

	private static void addNewItems() {

		System.out.println("enter the decription");
		scan.nextLine();
		String description = scan.nextLine();

		System.out.println("enter the price $");
		double price = scan.nextDouble();

		String[] newDescriptions = new String[TOTAL_MENU_ITEMS + 1];
		double[] newPrices = new double[TOTAL_MENU_ITEMS + 1];
		for (int i = 0; i < TOTAL_MENU_ITEMS; i++) {
			newDescriptions[i] = descriptions[i];
			newPrices[i] = prices[i];
		}

		descriptions = newDescriptions;
		prices = newPrices;

		descriptions[TOTAL_MENU_ITEMS] = description.toUpperCase();
		prices[TOTAL_MENU_ITEMS] = price;
		TOTAL_MENU_ITEMS++;

	}

	private static void showDescriptions() {
		showHeader();
		for (int i = 0; i < TOTAL_MENU_ITEMS; i++) {
			System.out.printf(MENU_ITEM_FORMAT, i + 1, descriptions[i], prices[i]);
		}
	}

	private static void removeItems() {
		System.out.println("enter the description you want to remove");
		scan.nextLine();
		String description = scan.nextLine();
		for (int i = 0; i < TOTAL_MENU_ITEMS - 1; i++) {
			if (descriptions[i].equalsIgnoreCase(description)) {
				for (int j = i; j < TOTAL_MENU_ITEMS - 1; j++) {// shift down
					descriptions[j] = descriptions[j + 1];
				}
				TOTAL_MENU_ITEMS--;
			}
		}
		// remove price

	}

	private static void editDescription() {
		System.out.println("enter the description to edit");
		scan.nextLine();
		String description = scan.nextLine();

		System.out.println("enter the new decription");
		String newDescription = scan.nextLine();
		for (int i = 0; i < TOTAL_MENU_ITEMS; i++) {
			if (descriptions[i].equalsIgnoreCase(description)) {
				descriptions[i] = newDescription.toUpperCase();
			}
		}

	}

	private static void editPrice() {
		System.out.println("enter the description of the price you want to change");
		scan.nextLine();
		String description = scan.nextLine();
		System.out.println("enter the new price");
		int price = scan.nextInt();
		for (int i = 0; i < TOTAL_MENU_ITEMS; i++) {
			if (descriptions[i].equalsIgnoreCase(description))
				prices[i] = price;
		}
	}
}
