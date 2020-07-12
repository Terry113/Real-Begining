package p2;

import java.util.Scanner;

public class demo_calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 numbers: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println("the sum is "+ add(number1,number2));
		System.out.println("the difference is "+ subtract(number1, number2));
		System.out.println("the quotient is "+ divide(number1, number2));
		System.out.println("the product is "+ mutiply(number1, number2));
		System.out.println(mutiply(number1));
		System.out.println(mutiply(number2));
		
	}

	private static int subtract(int number1, int number2) {
		return(number1 + number2);
	}

	private static int add(int number1, int number2) {
		return(number1 + number2);
		
	}//overloaded methods
	private static int mutiply(int number1, int number2) {
		return(number1 * number2);
		
	}
	private static int mutiply(int number) {
		return (number * number);
	}
	
	private static double divide(int number1, int number2) {
		return(number1 * 1.00 / number2* 1.00);
		}
}
