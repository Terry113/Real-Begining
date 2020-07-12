package p1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class demo1 {
private static Scanner scan = new Scanner(System.in);
	public static char C1;
	public static char c1;
	public static	char C2;
	public static char c2;
	public static	char C3;
	public static char c3;
	public static char C4;
	public static	char c4;
	public static char c5;
	public static char C5;
	
	static UserBag userBag = new UserBag(500);
	
  
	
	public static final int PASSWORD_LENGTH = 5;

		

		public static void main(String[] args) throws IOException, ClassNotFoundException {
			
			  
			
			
           UserBag userbag = new UserBag(500);
           FileManager.fillUsers(userbag, "FirstNames.txt", "LastNames.txt", PASSWORD_LENGTH);

			userBag.display();
			
			  
			
			//data abstraction
			
			
			/*
			 * for (int i = 0; i < 200; i++) {
			 * 
			 * fullNames[i] = firstNames[random.nextInt(200)] + "\t" +
			 * lastNames[random.nextInt(200)]; list1.add(fullNames[i]);
			 * if(random.nextBoolean()) { C1 = (char) (random.nextInt(26) + 'A'); }else { c1
			 * = (char) (random.nextInt(26) + 'a'); C1 = null; } if(random.nextBoolean()) {
			 * C2 = (char) (random.nextInt(26) + 'A'); }else { c2 = (char)
			 * (random.nextInt(26) + 'a'); C2 = (Character) null; if(random.nextBoolean()) {
			 * C3 = (char) (random.nextInt(26) + 'A'); }else { c3 = (char)
			 * (random.nextInt(26) + 'a'); C3 = c3; } if(random.nextBoolean()) { c4 = (char)
			 * (random.nextInt(26) + 'a'); }else { C4 = (char) (random.nextInt(26) + 'A');
			 * c4 = C4; } if(random.nextBoolean()) { c5 = (char) (random.nextInt(26) + 'a');
			 * }else { C5 = (char) (random.nextInt(26) + 'A'); c5 = C5; } password[i] = C1 +
			 * c1 + c2 + C2 + c3 + C3 +c4 +C4 + C5 + c5 + " "; username[i] = lastNames[i] +
			 * firstNames[i].charAt(1); User users = new User (username[i], password[i]); }
			 * }
			 * 
			 * oos.writeObject(list1);
			 * 
			 * oos.close();
			 * 
			 * User users = (User)ois.readObject(); System.out.println(users);
			 * 
			 * 
			 * System.out.println(list1); } private static void login() {
			 * 
			 * System.out.println("Enter your Username"); scan.nextLine(); String username =
			 * scan.nextLine(); System.out.println("enter your Password"); String password =
			 * scan.nextLine(); if (Login.isLoggedIn(users, username, password)) {
			 * 
			 * System.out.println("Sucsess"); } else {
			 * System.out.println("invalid Username or Password"); }
			 */
			scan.close();
		}

	}


