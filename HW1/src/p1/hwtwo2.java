package p1;

import java.util.Scanner;

public class hwtwo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("write your number for conversion");
		int f = scan.nextInt();
		
		int fh = f / 3600;
		int fhr = f % 3600;
		int fm = fhr / 60;
		int fs = fhr % 60;
		System.out.println("it is " + fh + " hours " + fm + " minutes " + fs + " secounds ");
		

	}

}
