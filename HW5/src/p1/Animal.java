package p1;

import java.util.Scanner;

public class Animal {
	Scanner scan = new Scanner(System.in);
	private double weight;
	private String type;
	private int age;

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCost() {
		return weight;
	}

	public void setColor(String color) {
		this.type = color;
	}

	public String getColor() {
		return type;
	}

	public void setAge(int speed) {
		this.age = speed;
	}

	public int getAge() {
		return age;
	}
	public Animal() {

	}


	public Animal(double weight, String type, int age) {
		this.weight = weight;
		this.age = age;
		this.type = type;

	}

	
	public void olds(int ages) {

		this.age = ages;
		age++;
	}

	public String toString() {
		return type + " is" + weight + " and it is " + age + " years old  ";
	}
	public void grow() {
		System.out.println("by how much?");
		int f = scan.nextInt();
		weight += f* 0.3;
	}
}
