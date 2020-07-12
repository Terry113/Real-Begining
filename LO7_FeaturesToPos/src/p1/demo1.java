package p1;

import java.util.Scanner;

public class demo1 {
	private static Scanner scan = new Scanner(System.in);
	private static int totalMenuItems = 0;
	private static String[] descriptions = new String[totalMenuItems];
	private static double[] prices = new double[totalMenuItems];
	private static int nu = 0;

	public static void main(String[] args) {// you can rename the things when you move varibles
		// showMainMenu();

		while (nu < 4) {
			showDescriptions();
			addNewItems();
			nu++;

		}
		removeItems();
		showDescriptions();
		editDescription();
		editPrice();
		showDescriptions();
	}

	

	private static void addNewItems() {

		System.out.println("enter the decription");
		String description = scan.nextLine();

		System.out.println("enter the price");
		double price = scan.nextDouble();
		scan.nextLine();
		String[] newDescriptions = new String[totalMenuItems + 1];
		double[] newPrices = new double[totalMenuItems + 1];
		for (int i = 0; i < totalMenuItems; i++) {
			newDescriptions[i] = descriptions[i];
			newPrices[i] = prices[i];
		}

		descriptions = newDescriptions;
		prices = newPrices;

		descriptions[totalMenuItems] = description.toUpperCase();
		prices[totalMenuItems] = price;
		totalMenuItems++;

	}

	private static void showDescriptions() {
		for (int i = 0; i < totalMenuItems; i++) {
			System.out.println(descriptions[i] + "\t" + prices[i]);

		}
	}

	private static void removeItems() {
		System.out.println("enter the description you want to remove");
		String description = scan.nextLine();
		for (int i = 0; i < totalMenuItems - 1; i++) {
			if (descriptions[i].equalsIgnoreCase(description)) {
				for (int j = i; j < totalMenuItems - 1; j++) {// shift down
					descriptions[j] = descriptions[j + 1];
				}
				totalMenuItems--;
			}
		}
		// remove price

	}

	private static void editDescription() {
		System.out.println("enter the description to edit");
		String description = scan.nextLine();
		System.out.println("enter the new decription");
		String newDescription = scan.nextLine();
		for (int i = 0; i < totalMenuItems; i++) {
			if (descriptions[i].equalsIgnoreCase(description)) {
				descriptions[i] = newDescription.toUpperCase();
			}
		}

	}

	private static void editPrice() {
		System.out.println("enter the description of the price you want to change");
		String description = scan.nextLine();
		System.out.println("enter the new price");
		int price = scan.nextInt();
		for (int i = 0; i < totalMenuItems; i++) {
			if (descriptions[i].equalsIgnoreCase(description))
				prices[i] = price;
		}
	}
}
