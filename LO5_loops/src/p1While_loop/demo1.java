package p1While_loop;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		int count = 0;
		
//		Scanner scan = new Scanner(System.in);
//		double num = 0.0; //scope of varible, make sure that the varible is visible to out side blocks
//		while (num >= 0.0) { //pre-test
//		System.out.println("enter a number");
//		num = scan.nextInt();

//		}
		Scanner scan = new Scanner(System.in);
		double num = 0.0; // scope of varible, make sure that the varible is visible to out side blocks
		while (true) { // infinite loop
			if (count > 4 ) {
			 break;	
			}
			System.out.println("enter a number");
			num = scan.nextInt();
			System.out.println(num);
			count += 1;

		}

		System.out.println("the number is: " + num);
	
	}

}
