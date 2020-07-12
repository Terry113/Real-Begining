package p3_switchCase;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a Letter Grade");
		String letgra = scan.nextLine();
		double score = 0;
		switch (letgra) {
		case "a":
			score = 4.0;
			break;
		case "b":// this is used to stop the program or it will go to defalt
			score = 3.0;
			break;
		case "c":
			score = 2.0;
			break;
		case "d":
			score = 1.0;
			break;
		case "f":
			score = 0.0;
			break;
		default:
			score = 100000.0;
		}
		System.out.println("your score is " + score);
	}

}
