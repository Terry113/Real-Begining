package hw;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write your name");
		String name = scan.nextLine();
		int a =(name.indexOf(" "));
		System.out.println(name.substring(0, a) + " " + a);
		
		String b = name.substring(a);
		int n = b.length();
		int m = n - 1;
		System.out.println(name.substring(a) + " " + m);
		
	}

}
