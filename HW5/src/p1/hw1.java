package p1;

import java.util.Scanner;

public class hw1 {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Bike coolOne = new Bike(50, "red", 0);
		while (true) {
			System.out.println("What do you want to do?");
			System.out.println("0" + "   exit");
			System.out.println("1" + "   speed up");
			System.out.println("2" + "   slow down");
			int num = scan.nextInt();

			if (num == 1) {

				coolOne.speedUp();
			} else if (num == 2) {

				coolOne.slowDown();
			}

			
		coolOne.setColorAndPrice("white",9.99 );
			System.out.println("enter a new color");
			String newColor = scan.nextLine();
			
			if (num == 0) {
				break;

			}
		}
System.out.println(coolOne);
Bike bike2 = new Bike(coolOne);

Bike bike3 = bike2.deepCopy(bike2);
System.out.println(bike2);
	}
  
 
}
