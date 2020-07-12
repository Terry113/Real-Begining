package p1;

import java.util.Scanner;

public class Hw3 {
private static int agew = 0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("choose your animal");
		System.out.println("0 \t dog");
		System.out.println("1 \t cat");
int choose = scan.nextInt();
scan.nextLine();
if (choose == 0) {
	Animal dog = new Animal(50, "dog", 1); 
	System.out.println("what to do?");
	String toDo = scan.nextLine();
	if(toDo.contentEquals("feed")) {
		
	}else if(toDo.contentEquals("grow")){
		dog.setAge(1);
		dog.getAge();
		dog.olds(1);
		agew++;
		dog.setAge(agew);
	}else if(toDo.contentEquals("play")){
		String played = scan.nextLine();
		System.out.println("the " + "dog is " + played + "ing.'" );
	}else if(toDo.contentEquals("feed")) {
		System.out.println("1");
		System.out.println("by how much?");
		int f = scan.nextInt();
		dog.setWeight(f* 0.3);
		
	}else {
		System.out.println(dog);
	}
}
	}

}
