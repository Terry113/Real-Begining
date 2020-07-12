package p1;

import java.util.Scanner;

public class hw2 {
	private static int speed = 0;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Bike coolTwo = new Bike(100, "Blue", 0);
		while (true) {
			System.out.println("What do you want to do?");
			System.out.println("0" + "   exit");
			System.out.println("1" + "   speed up");
			System.out.println("2" + "   slow down");
			int num = scan.nextInt();

			if (num == 1) {

				speed += 2;
			} else if (num == 2) {

				speed -= 2;
			}

			coolTwo.setSpeed(speed);
			coolTwo.getSpeed();
			coolTwo.fast(speed);
			System.out.println(speed);
			if (speed == -1 || speed == -2) {
				speed = 0;
			}
			if (num == 0) {
				break;

			}
		}
System.out.println(coolTwo);
	}

}
