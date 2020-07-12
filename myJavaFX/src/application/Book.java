package application;

public class Book extends LibraryObj{

private String ISBN;
private String author;
private int roomNum;

public Book(String title, String iSBN, String author, Double price,int roomNum) {
	super(title, price);
	
	ISBN = iSBN;
	this.author = author;
	
}


public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}


@Override
public String toString() {
	
	return "Book [title=" + getTitle() + ", ISBN=" + ISBN + ", author=" + author + ", Price=" + getPrice() + ",Room Number=" +roomNum + "]";
}



}
