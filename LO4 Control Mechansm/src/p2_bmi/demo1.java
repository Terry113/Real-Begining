package p2_bmi;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your weight");
		double weight = scan.nextDouble();
		System.out.println("enter your height");
		double height = scan.nextDouble();
		double bmi = 703.0 * (weight) / (height * height);
		System.out.println("your BMI is " + bmi);
		if (bmi >= 25.0) {
			System.out.println("you are overweight");
		} else if (bmi >= 18.5) {
			System.out.println("You are normal weight");
		} else {
			System.out.println("you are underweight");
		}
	}
}