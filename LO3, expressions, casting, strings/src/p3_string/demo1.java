package p3_string;

public class demo1 {

	public static void main(String[] args) {
		String name = "helo, hello";//reference varible
		String line = "----------------";
	System.out.println(name);
	int n = name.length(); // gives # of letters
	System.out.println(n);
System.out.println(name.toUpperCase());// turns to upper case
System.out.println(name.toLowerCase());//turns to lower case
System.out.println(line);
System.out.println(name.charAt(0));//finds location 
System.out.println(name.contains("e"));//searches the string for the letter
System.out.println(name.toLowerCase().contains("hello"));
System.out.println(name.contentEquals("Hello, hello"));
System.out.println(name.equalsIgnoreCase("hello, hello"));
System.out.println(name.indexOf("helo"));//anything not found is negitive one
	System.out.println(name.substring(3)); //use , to stop somewhere
	System.out.println(name.endsWith("o"));
	System.out.println(name.startsWith("h"));
	System.out.println(name.lastIndexOf("doe"));
	System.out.println(name.replace("hello", "bye"));
	System.out.println(name);
	System.out.println(name.trim());
	}

	
	}
	
	


