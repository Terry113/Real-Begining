package p1.application;

public class DVD extends LibraryObj {
private String genre;
private String year;
private boolean reserved;
public DVD(String title, double price, String genre, String year,boolean reserved) {
	super(title, price);
	this.genre = genre;
	this.year = year;
	this.reserved = reserved;
}

public boolean getReserved() {
	return reserved;
}

public void setReserved(boolean isReserved) {
	this.reserved = isReserved;
}

public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
@Override
public String toString() {
	return "DVD [genre=" + genre + ", year=" + year + ", Title()=" + getTitle() + ", Price()=" + getPrice() + "]";
}

public boolean checkIn() {
	return true;
	
}
public boolean checkOut() {
	return false;
	
}



}
