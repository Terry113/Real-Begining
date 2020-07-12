package p1;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write your score");
		int f = scan.nextInt();
		if (f >= 101) {
			System.out.println("over 100 so an A");
		} else if (f >= 91) {
			System.out.println("you got an A");
		} else if (f >= 81) {
			System.out.println("You got a B");
		} else if (f >= 71) {
			System.out.println("You got a C");
		} else {
			System.out.println("You got a D");
		}

	}

}
