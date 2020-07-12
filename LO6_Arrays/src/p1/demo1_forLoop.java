package p1;

public class demo1_forLoop {

	public static void main(String[] args) {
		// for loop is used when the number of iterations is known

		for (int i = 0; i < 10; i++) {// first is state the test and then add or subtract from the i
			System.out.print(i + " ");

		}
		for (int i = 10; i > 1; i--) {// first is state the test and then add or subtract from the i
			System.out.println(i);
		}
		for (int i = 1; i < 10; i++) {//nested for loop
			for (int j = 1; j < 10; j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
	}

}
