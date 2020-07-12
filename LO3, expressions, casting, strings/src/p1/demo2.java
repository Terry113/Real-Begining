package p1;

import java.text.DecimalFormat;

public class demo2 {

	public static void main(String[] args) {
		int a = 250000000;
		double b = 13000.5;
		double c = 4.8;
		double d = (a + b)/c;
		double e = a + b/c;
		DecimalFormat format1 = new DecimalFormat("0,000.00");
		System.out.print(format1.format(d));// stays on same line
		
		System.out.println("\t " + format1.format(e)); // goes to next line
		System.out.println("\t " + format1.format(10000000.0000000));

	}

		}


