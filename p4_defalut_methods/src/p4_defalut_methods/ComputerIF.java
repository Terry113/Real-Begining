package p4_defalut_methods;
//interface with one instance VAR is called a functional interface;
public interface ComputerIF {
double compute(double num1, double num2);

default double power(int n1, int n2) {
	return Math.pow(n1,n2);
	
	
	 
		
	}
static int power2(int n, int m) {
	return (int) Math.pow(n, m);
	
}
}

