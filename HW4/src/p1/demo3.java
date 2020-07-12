package p1;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your Gender");
		String g = scan.nextLine();
		String f = scan.nextLine();
		String gg = (g.toLowerCase());
		if (gg.contains("female")) {
			System.out.println("GIRL");
		} else if (gg.contains("male")) {
			System.out.println("BOY");
		} else {
			System.out.println("OTHER");
		}

	}

}
