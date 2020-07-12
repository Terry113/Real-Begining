package hw;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("type the first number you want to multiply");
		int a = scan.nextInt();
		System.out.println("type the secound number you want to multiply");
		int b = scan.nextInt();
		int c = a * b;
		System.out.printf("%10s%10s%10s%10s%n", "a", "*", "b", "result");
		System.out.printf("%10d%20d%10d", a, b, c);
	}

}
