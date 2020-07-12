package p1;

import java.util.Scanner;

public class hwtwo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many milligrams per drink?");
		String c = scan.nextLine();
		int cu = Integer.parseInt(c);
		int cups = 10000 / cu + 1;
		System.out.println("it would take " + cups + " cups");
	}

}
