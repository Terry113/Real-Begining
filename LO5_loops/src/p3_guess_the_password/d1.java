package p3_guess_the_password;

import java.util.Scanner;

public class d1 {//you can do public static just to create a string to show all
	//you can use mutiple methods inside other methods

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Enter a Username");
			String user = scan.nextLine();
			System.out.println("Enter a Password");
			String password = scan.nextLine();
			if (password.contentEquals("password") && user.contentEquals("me")) {
				System.out.println("you guessed it!");
				break;
			}
			System.out.println("incorrect username or password!\n");
		} while (true);
	scan.close();
	}

	public static void Showmenu() {// this is to create blocks and put them together in the main

	}
}
