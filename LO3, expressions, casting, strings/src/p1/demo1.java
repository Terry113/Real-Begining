package p1;

public class demo1 {

	public static void main(String[] args) {
		int a = 25;
		double b = 13.7;
		double c = 4.8;
		double d = (a + b)/c;
		double e = a + b/c;
		System.out.printf("%10s%10s%10s%10s%n","a", "b", "c", "result");
		System.out.println("-------------------------------------------");
		System.out.printf("%10d%10.2f%10.2f%10.2f%n",a, b, c, d);
		System.out.printf("%10d%10.2f%10.2f%10.2f%n",a, b, c, e);
	}

}
