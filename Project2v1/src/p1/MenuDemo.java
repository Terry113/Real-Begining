package p1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MenuDemo {
	// bags
	public static MenuBag myBag = new MenuBag(100);
	public static OrderBag myOrderBag = new OrderBag();
	public static GrandTotalBag myTotalOrderBag = new GrandTotalBag();
	private static final int MAX_BAG_SIZE = 100;
	public static UserBag userBag = new UserBag(MAX_BAG_SIZE);

	// finals
	private static final String RESTAURANT_NAME = "Terry's Restaurant";
	private static final String RESTAURANT_PHONE = "(631-123-4567)";
	private static final String HEADER_FORMAT = "%n%25s%n%23s%n%n%-10s%10s%10s";
	private static final String LINE = "-------------------------------";
	private static final String EDIT_FORMAT = "%-10d%s%n";
	private static final String MENU_ITEM_FORMAT = "%-10d%10s%10.2f%n";
	public static final String menuItemFormat = "%-5d%10S%10.2f%5d%10.2f%n";
	// statics
	private static String orderNum = "";
	public static int usernameCount = 0;
	public static Scanner scan = new Scanner(System.in);
//boolean
	private static boolean isLoggedIn = false;

	public static void main(String[] args) {

		CreateUserNames();
		while (!isLoggedIn) {
			login();
		}
		editMenu();
		do {
			showMenu();
		} while (true);
	}

	private static void showMenu() {
		myBag.display();

	}

	public static void CreateUserNames() {
		System.out.println("how many Users do you want to create?");
		int num = scan.nextInt();
		UserManager.createUsers(userBag, num);

	}

	public static void addMenu() {

		for (int i = 0; i < 4; i++) {
			System.out.println("enter description, quantity, and price.");
			scan.nextLine();
			String entry = scan.nextLine();
			String[] entryTokens = entry.split(" ");
			int itemNumber = Integer.parseInt(entryTokens[0]);
			String description = entryTokens[1];

			double price = Double.parseDouble(entryTokens[2]);
			Book menuItem = new Book(description, price);
			int quantity = Integer.parseInt(entryTokens[1]);
			menuItem.setDescription(description);
			menuItem.setPrice(price);

			System.out.printf(menuItemFormat, itemNumber, description, price, quantity);

			myBag.insert(menuItem);

		}

	}

	public static void removeItem() {
		System.out.println("which ID to you want to remove");
		String RemoveID = scan.nextLine();
		myBag.removeById(RemoveID);
	}

	public static void Order() {
		System.out.println("What Type the ID of the Order");
		myBag.display();
		orderNum = scan.nextLine();
		myOrderBag.insertOrders(myBag.getMenuBag(orderNum));
		myTotalOrderBag.insertOrders(myBag.getMenuBag(orderNum));
		

	}

	private static void chooseItemsAndQuantity() throws FileNotFoundException {

		System.out.println("enter Item Number");

		int itemNumber = scan.nextInt();

		if (itemNumber == 0) {
			myOrderBag.showOrders();

		} else if (itemNumber == 200) {
			editMenu();

		} else if (itemNumber == 100) {
			myTotalOrderBag.showTotalOrders();
		} else {
			askForQuantity();
			
		}
	}

	private static void askForQuantity() {
		
		System.out.println("What Type the ID of the Order");
		myBag.display();
		orderNum = scan.nextLine();
		System.out.println("how much of it do you want?");
		int orderNumf = Integer.parseInt(orderNum);
		myBag.getMenuBag(orderNum).getQuantity(orderNumf);
		myBag.getMenuBag(orderNum).getSubtotal(myBag.getMenuBag(orderNum).setQuantity() * myBag.getMenuBag(orderNum).getPrice());
		myOrderBag.insertOrders(myBag.getMenuBag(orderNum));
		myTotalOrderBag.insertOrders(myBag.getMenuBag(orderNum));
		

	}

	private static void login() {

		System.out.println("Enter your Username");
		scan.nextLine();
		String username = scan.nextLine();
		System.out.println("enter your Password");
		String password = scan.nextLine();
		if (UserManager.isLoggedIn(userBag, username, password)) {
			isLoggedIn = true;
			System.out.println("Sucsess");
		} else {
			System.out.println("invalid Username or Password");
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
			addMenu();
			break;
		case 2:
			removeItem();
			break;
		case 3:
			System.out.println("o");
			break;
		case 4:

			break;
		default:
			System.out.println("Invaild Number");
			break;
		}

	}

}
