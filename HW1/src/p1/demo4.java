package p1;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Whats the date?");
        String dateone = input.nextLine();
        System.out.println("whats the wind speed?");
        String windone = input.nextLine();
        System.out.println("whats temperature?");
        String tempone = input.nextLine();
        
		System.out.println("Whats the date tomorrow?");
        String datetwo = input.nextLine();
        System.out.println("whats the wind speed tomorrow?");
        String windtwo = input.nextLine();
        System.out.println("whats temperature tomorrow?");
        String temptwo = input.nextLine();
        System.out.printf("%10S%10S%10S", " date"," windspeed", "temperature");
        System.out.println("\n----------------------------------");
        System.out.printf("%10s%10s%10s", dateone, windone, tempone);
        System.out.println("\n");
        System.out.printf("%10s%10s%10s", datetwo, windtwo, temptwo);
	}

}
