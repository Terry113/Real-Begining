package p1;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("%s%n%-10s%10s%10s", "Restaurant", "number", "food", "Price");
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.printf("%-10s%10s%10s%n", "1", "Pork", "9.99");
		System.out.printf("%-10s%10s%10s%n", "2", "Lamb", "12.99");
		System.out.printf("%-10s%10s%10s%n", "3", "Beef", "15.99");
		System.out.printf("%-10s%10s%10s%n", "4", "Fish", "9.99");
		int num = scan.nextInt();
		switch (num) {
		case 1:
			System.out.println("you chose Pork for 9.99");
			break;
		case 2:
			System.out.println("you chose lamb for 12.99");
			break;
		case 3:
			System.out.println("you chose Beef for 15.99");
			break;
		case 4:
			System.out.println("you chose Fish for 9.99");
			break;
		}
	}

}
