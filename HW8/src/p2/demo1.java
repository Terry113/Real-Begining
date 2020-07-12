package p2;

import java.util.Scanner;

public class demo1 {
	public static int length = 0;
	public static String name;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your name");
		name = scan.nextLine();

		int ints = 0;

		do {
			try {
				System.out.println("what is your Zip Code?");

				ints = scan.nextInt();
				length = String.valueOf(ints).length();
			} catch (Exception e) {
				System.out.println("you entered a invalid number");
				scan.nextLine();
			}

		} while (length != 5);
		Person p1 = new Person(name, ints);
		System.out.println(p1);
		System.out.println("done");
	}

}
