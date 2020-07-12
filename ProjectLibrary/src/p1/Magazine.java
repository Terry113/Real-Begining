package p1;

public class Magazine extends LibraryObj {
private String date;

public Magazine(String title, double price, String date) {
	super(title, price);
	this.date = date;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

@Override
public String toString() {
	return "Magazine [date=" + date + ", Title()=" + getTitle() + ", Price()=" + getPrice() + "]";
}

}
