package hw;

import java.util.Scanner;

public class hw4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write sentence with the in it");
		String sent = scan.nextLine();
		System.out.println("write a word to replace the");
		String rep = scan.nextLine();
		System.out.println(sent.replace("the", rep));
	}

}
