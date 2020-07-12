
public class demo1 {

	public static void main(String[] args) {
		// one varible for 1 value
		int x = 5;
		int y = 10;
		x = 10;
	   	//one var for 1 value
		String name = "john";
		name = "jason";
		// an array allows one var to have many values
		//each value is id'd by an index value
		// how to declare an array
		int[] numbers = new int[10];//default all elements are 0 
		numbers[0] = 100;
		double[] doubnums = new double[5]; // default = 0.0
		System.out.println(doubnums[2]);
		char[] car = new char[20]; // default all =  
		String[] names = new String[50]; // default value = null 
		names[1] = "terry";
		names[2] = "jason";
				
		System.out.println(names[49]);
		boolean[]flags = new boolean[5];// deafult false
		System.out.println(flags[1]);
	}

}
