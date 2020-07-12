package p1;

import java.util.Random;

public class hw1 {

	public static void main(String[] args) {
		Random random = new Random();
		String mixedFNames = "Rizwan Khalil Beatriz Iman Jocelyn Mimi Honey Caden Aarav Bryan Addison";
		String mixedLNames = "Joyce Kirkpatrick Zhang Hudson Simpson Cannon Silva Sweeney Cochran Ellwood";
		String[] firstNames = mixedFNames.split(" ");
		String[] lastNames = mixedLNames.split(" ");
		String[] fullNames = new String[10];
		for (int i = 0; i<10;i++) {
			fullNames[i] = firstNames[random.nextInt(10)] + "\t" + lastNames[random.nextInt(10)];
		}
		for (int j = 0; j < 10; j++) {
			System.out.println(fullNames[j]);
		}

	}

}
