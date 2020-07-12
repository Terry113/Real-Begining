package p1;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write your age");
		int age = scan.nextInt();
		if (age >= 61) {
			System.out.println("you old");
		} else if (age >= 21) {
			System.out.println("you are middle aged");
		} else if (age >= 11) {
			System.out.println("you are young");
		} else {
			System.out.println("you are a baby");
		}
	}

}
