package p1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BookDemo1 {
	public static LibraryObj[] libObj = new LibraryObj[200];

	public static void main(String[] args) throws FileNotFoundException {
		libObj = BookBag.readAndMix();

		DVD dvd1 = new DVD("Song", 9.99, "Action", "1950", true);
		Magazine mag1 = new Magazine("News", 9.99, "1990");

		BookBag.insert(dvd1);
		BookBag.insert(mag1);
		BookBag.display(libObj);
		dvd1.reserve();
		LibraryObj x = BookBag.search((LibraryObj k) -> {

			if (k.getTitle().contentEquals("action")) {
				return true;
			}
			return false;
		});
System.out.println(x);
	}
}
