package p1;

import java.util.Scanner;

public class Demo {
	//method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your name");
		String name = input.nextLine();
		System.out.println("Hi,"+ name);
		System.out.println("enter your address");
		String address = input.nextLine();
		
		System.out.printf("%-10s\t%20s%n", "NAME", "ADDRESS");
		System.out.println("---------------------------------------------");
		System.out.printf("%-10s\t%20s%n" ,name, address);
				 }
} 
