package p1;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter today's Temp");
		int temp = scan.nextInt();
		if (temp >= 80) {
			System.out.println("hot");
		} else if (temp >= 60) {
			System.out.println("Just right");
		} else {
			System.out.println("cool");
		}
	}
}
