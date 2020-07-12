package p1;

import java.util.Scanner;

public class Hwtwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write a number for the conversion");
		String f = scan.nextLine();
		double fr = Integer.parseInt(f);
		double fa = (fr - 32) * 5 / 9;
		System.out.println("the temp is " + fa + " celsius");
				
	}

}
