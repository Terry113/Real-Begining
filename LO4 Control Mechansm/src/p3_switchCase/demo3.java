package p3_switchCase;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a double value");
		int letgra =scan.nextInt();
		
		switch(letgra) {
		case 1 : System.out.println("you entered 1");
		break;
		default: 
			System.out.println("that is not a number");
		}
	}

}
