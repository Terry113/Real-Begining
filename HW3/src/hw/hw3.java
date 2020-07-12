package hw;

import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please write a sentence");
		String sent = scan.nextLine();
		System.out.println("please Write a word in the sentence");
		String word = scan.nextLine();
		int length = word.length();
		int where = (sent.indexOf(word));
		System.out.println("the word is " + where + " letters in and " + length + " letters long");
		

	}

}
