package p2_Anominous_Use;

public class demo1 {

	public static void main(String[] args) {
		Computer add = new Computer() {

			@Override
			public double compute(double num1, double num2) {

				return num1 + num2;
			}

		};
		System.out.println(add.compute(5, 20));
		Computer subtract = new Computer() {

			@Override
			public double compute(double num1, double num2) {

				return num1 -num2;
			}

		};
		System.out.println(subtract.compute(5, 20));

	}

}
