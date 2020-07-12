package p4_random_numbers;

import java.util.Random;

public class demoRandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		
		
		for (int i = 0; i < 2000; i++) {
			
			
			
			System.out.println(random.nextInt(1001));
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
