package p1;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("enter your name");
		String name = input.nextLine();
		System.out.println("Hi,"+ name);
		input.close();

	}

}
