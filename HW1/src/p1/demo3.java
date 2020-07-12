package p1;

import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("write the first name");
        String nameone = input.nextLine();
        System.out.println("write the secound name");
        String nametwo = input.nextLine();
        System.out.println("write the third name");
        String namethree = input.nextLine();
        System.out.printf("%10s%10s%10s", nameone, nametwo, namethree);
	}

}
