package p1;

import java.text.NumberFormat;
import java.util.Locale;

public class demo3 {

	public static void main(String[] args) {
		NumberFormat format1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		double amount = 1234567.1234;
				System.out.println(format1.format(amount));
	}

}
