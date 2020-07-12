package p4_defalut_methods;

public class demo1 {

	public static void main(String[] args) {
		ComputerIF c1 = (m,n)->{
			return  m+n;
			
			
		};
System.out.println(c1.compute(1, 20));
System.out.println(c1.power(5, 6));
System.out.println(ComputerIF.power2(1, 20));
	}

}
