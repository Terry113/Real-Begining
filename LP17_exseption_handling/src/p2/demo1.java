package p2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");

		int number;
		try {
			number = scan.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();

		} finally {
System.out.println("done");
		}

	}
}
