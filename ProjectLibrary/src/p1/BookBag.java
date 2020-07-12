package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class BookBag {
	public static ArrayList<String> bookTitles = new ArrayList<String>();
	public static ArrayList<String> bookIsbns = new ArrayList<String>();
	public static LibraryObj[] libObj = new LibraryObj[300];

	public static void readBookIsbn() throws FileNotFoundException {
		File file = new File("textbook_isbns.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String isbn = scan.nextLine();
			bookIsbns.add(isbn);

		}

	}

	public static void readBookTitles() throws FileNotFoundException {
		File file = new File("textbook_titles.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			String titles = scan.nextLine();
			bookTitles.add(titles);

		}

	}

	public static double pickPrice() {

		double price = (Math.random() * 200);

		return price;
	}

	public static LibraryObj[] readAndMix() throws FileNotFoundException {
		DecimalFormat df = new DecimalFormat("0.00");
		ArrayList<String> authors = FileManager.makeFullNames("FirstNames.txt", "LastNames.txt");
		readBookIsbn();
		readBookTitles();

		for (int i = 0; i < 200; i++) {

			String isbn = bookIsbns.get((int) (Math.random() * 2000));

			double randomPrice = pickPrice();
			String stringPrice = df.format(randomPrice);
			double price = Double.parseDouble(stringPrice);

			libObj[i] = new Book(bookTitles.get((int) (Math.random() * 2000)), isbn,
					authors.get((int) (Math.random() * 200)), price, ((int) Math.random() * 5));
		}
		return libObj;
	}

	public static void display(LibraryObj[] books2) {
		for (int i = 0; i < 200; i++) {
			LibraryObj boo = books2[i];
			System.out.println(boo);
		}
	}

	private static int nElems;

	

	public static void insert(LibraryObj book) {
		libObj[nElems++] = book;
	}

	public BookBag(int size) {
		 libObj = new Book[size];
	}

	public LibraryObj removeById(String id) {

		int i = 0;
		for (i = 0; i < nElems; i++) {
			String block = String.valueOf(((Book) libObj[i]).getISBN());
			if (block.equals(id)) {
				break;
			}
		}
		if (i == nElems) {
			return null;
		} else {
			Book temp = (Book) libObj[i];
			for (int j = i; j < nElems - 1; j++) {
				libObj[j] = libObj[j + 1];
			}
			nElems--;
			return temp;
		}

	}

	

	public Book getbooks(String num) {
		for (int i = 0; i < nElems; i++) {
			String block = String.valueOf(((Book) libObj[i]).getISBN());
			if (block.contentEquals(num))
				
			return (Book) libObj[i];
		}
		return null;

	}

	public static LibraryObj search(Predicate<LibraryObj> predicate) {
		// TODO Auto-generated method stub
		for(int i = 0;i<nElems;i++) {
			if(predicate.test(libObj[i]) ){
				return libObj[i];
			}
		}
		return null;
	}

	
	

}
