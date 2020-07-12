package p1;

import java.util.Scanner;

public class Menu1 {
	public static Scanner scan = new Scanner(System.in);
	public static String line = "----------------------------------------";

	public static void main(String[] args) {

		do {
			System.out.println("Enter a Username");
			String user = scan.nextLine();
			System.out.println("Enter a Password");
			String password = scan.nextLine();
			if (password.contentEquals("q") && user.contentEquals("w")) {
				System.out.println("Sucess!\n");
				while (true) {
					Showmenu();
				}

			}
			System.out.println("incorrect username or password!\n");
		} while (true);

	}

	public static void Showmenu() {
		System.out.printf("%n%s%20s%n%-10s%10s%10s", "Terry's Restaurant", "(631-123-4567)", "Number", "Food", "Price");
		System.out.println("\n" + line);
		System.out.println();
		System.out.printf("%-10s%10s%10s%n", "1", "Pork", "9.99");
		System.out.printf("%-10s%10s%10s%n", "2", "Lamb", "12.99");
		System.out.printf("%-10s%10s%10s%n", "3", "Beef", "15.99");
		System.out.printf("%-10s%10s%10s%n", "4", "Fish", "9.99");
		choose();

	}

	private static void choose() {
		System.out.println(line);
		System.out.println("type the number you want to order");
		int num = scan.nextInt();
		switch (num) {
		case 1:
			System.out.println("You chose Pork for $9.99");
			break;
		case 2:
			System.out.println("You chose lamb for $12.99");
			break;
		case 3:
			System.out.println("You chose Beef for $15.99");
			break;
		case 4:
			System.out.println("You chose Fish for $9.99");
			break;
			default: 
				System.out.println("there is no type that is on there");

		}
	}

}
