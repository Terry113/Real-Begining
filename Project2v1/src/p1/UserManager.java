package p1;

import java.util.Random;
import java.util.Scanner;

public class UserManager {
	public static void add(UserBag userbag, User user) {
		userbag.insert(user);

	}

	public static void create(UserBag userbag) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a new Username, password, and Fullame");
		String newUserInfo = scan.nextLine();
		
		String[] userTokens = newUserInfo.split(" ");
		
		
		User newUser = new User(userTokens[0], userTokens[1], userTokens[2]);
		
		userbag.insert(newUser);
	}

	public static boolean isLoggedIn(UserBag userBag, String username, String password) {
		User userFound = null;
		boolean isLoggedInFlag = false;
		userFound = userBag.findByName(username);
		if (userFound != null) {
			if (password.equals(userFound.getPassword())) {
				isLoggedInFlag = true;
			}

		}
		return isLoggedInFlag;

	}

	public static void display(UserBag userBag, String userName, String password) {
		User userFound = userBag.findByName(userName);
		if (isLoggedIn(userBag, userName, password)) {
			System.out.println("login is correct" + userFound.getName());
		} else {
			System.out.println("incorrect");
		}
	}

	public static void createUsers(UserBag userbag, int times) {
		for (int i = 0; i < times; i++) {
			create(userbag);
		}
	}

	public static void FillUsers(UserBag userbag, int times) {
		Random random = new Random();

		for (int i = 0; i < times; i++) {
			int randomNumber1 = random.nextInt(100);
			int randomNumber2 = random.nextInt(100);
			String username = "u" + randomNumber1;
			String password = "p" + randomNumber2;
					
			String name = "up" + (randomNumber1 + randomNumber2);
			User newUser = new User(username, password, name);
			userbag.insert(newUser);
		}
	}
}
