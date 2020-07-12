package p1;

import java.util.Scanner;

public class demo1 {
	public static int length = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;

		do {
			try {
				System.out.println("Enter an Integer Numbers ");

				int n = scan.nextInt();
				total += n;
				length++;
			} catch (Exception e) {
				System.out.println("you entered an invalid number");
				scan.nextLine();
			}

		} while (length != 5);
		System.out.println(total);
		System.out.println("done");
	}
	
	
}
