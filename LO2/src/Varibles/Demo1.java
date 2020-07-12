package Varibles;

public class Demo1 {

	public static void main(String[] args) {
		char ch;
		ch = 'a';//2 bytes
		System.out.println(ch);
		ch = 'd';
		System.out.println(ch);
		
		int number;//4 bytes
		number = 109;
		
		int q = number / 100;
		 int remainder = number %10;
				 System.out.println("quotient is" + q);
				System.out.println("remaider is " + remainder);
				double numd ; // 8 byte
				numd = 100;
				double res = numd / 3;
				System.out.println(res);
				
	}

}
