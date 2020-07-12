package p1While_loop;

public class demo2 {

	public static void main(String[] args) {
		int c = 0;

		while (c < 5) {
			
			System.out.println("terry");
			c++;
			if (c == 2) {
				continue;// skips the remaining statement
			}
			System.out.println("zhang");
			
		}

	}

}
