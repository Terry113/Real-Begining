package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	
	public static void fillUsers(UserBag userBag, String firstNameFile, String lastNameFile, int passwordLength)
			throws FileNotFoundException {
		File file = new File("file1.txt");
		if(file.exists()) {
		ArrayList<String> fullNamesArr = FileManager.makeFullNames("FirstNames.txt", "LastNames.txt");
		System.out.println(fullNamesArr);
		PrintWriter pw = new PrintWriter("File1.txt");
		ArrayList<String> usernames = FileManager.makeUserNames(fullNamesArr);
		ArrayList<String> passwords = FileManager.makePasswords(fullNamesArr, passwordLength);
		for (int i = 0; i < fullNamesArr.size(); i++) {
			User user = new User(usernames.get(i), passwords.get(i));
			userBag.insert(user);
			

			pw.println((User) user);
			
			if (i == fullNamesArr.size()-1) {
				pw.close();
			}
		}

		userBag.display();
		}
	}

	public static ArrayList<String> readNames(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		ArrayList<String> nameList = new ArrayList<String>();
		while (scan.hasNextLine()) {
			nameList.add(scan.nextLine());

		}

		return nameList;

	}

	public static ArrayList<String> makeFullNames(String firstNameFile, String lastNameFile)
			throws FileNotFoundException {
		ArrayList<String> firstNameArray = FileManager.readNames(firstNameFile);
		ArrayList<String> lastNameArray = FileManager.readNames(lastNameFile);
		ArrayList<String> fullNamesArray = new ArrayList<String>();
		for (int i = 0; i < 200; i++) {
			fullNamesArray.add(extractRandomNumber(firstNameArray) + " " + extractRandomNumber(lastNameArray));
		}
		return fullNamesArray;

	}

	public static String extractRandomNumber(ArrayList<String> names) {
		int randomIndex = (int) (Math.random() * names.size());
		return names.get(randomIndex);
	}

	public static void saveFullNames(ArrayList<String> fullNames, String filename) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(filename);
		for (int i = 0; i < fullNames.size(); i++) {
			pw.print(fullNames.get(i));
			pw.close();
		}

	}

	public static ArrayList<String> makeUserNames(ArrayList<String> fullNames) {
		ArrayList<String> userNames = new ArrayList<String>(fullNames.size());
		for (int i = 0; i < fullNames.size(); i++) {
			String[] namesTokens = fullNames.get(i).split(" ");
			userNames.add(namesTokens[1] + (namesTokens[0].charAt(0)));

		}
		return userNames;
	}

	public static ArrayList<String> makePasswords(ArrayList<String> fullnames, int passwordLength) {
		ArrayList<String> passwords = new ArrayList<String>();
		for (int i = 0; i < fullnames.size(); i++) {
			passwords.add(getRandomLetters(passwordLength) + (int) (Math.random() * 10));
		}
		return passwords;
	}

	public static String getRandomLetters(int passwordLength) {
		String str = " ";
		for (int i = 0; i < passwordLength; i++) {
			str += getRandomLetter();
		}
		return str;
	}

	private static char getRandomLetter() {

		int randomCAPletterInNumber = 65 + (int) (Math.random() * 26);
		int randomLOWletterInNumber = 97 + (int) (Math.random() * 26);
		if ((Math.random()) >= .5) {
			return (char) randomCAPletterInNumber;
		} else {
			return (char) randomLOWletterInNumber;
		}
	}
}
